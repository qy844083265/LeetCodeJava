/*
 * @Author: your name
 * @Date: 2020-07-07 22:45:52
 * @LastEditTime: 2020-07-07 23:23:57
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\stack\q0144\Solution.java
 */
package java.question.Stack.q0144;

import java.common.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树先序遍历
 */
public class Solution {
    /**
     * 递归做法
     * 
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        recurse(root, list);
        return list;
    }

    public void recurse(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        list.add(node.val);
        recurse(node.left, list);
        recurse(node.right, list);
    }

    /**
     * 迭代做法
     */
    public List<Integer> preorderTraversalNoReverse(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while (!stack.isEmpty() || p != null) {
            if ( p != null) {
                stack.push(p);
                list.add(p.val);
                p = p.left;
            }else{
                TreeNode node = stack.pop();
                p = node.right;
            }
            
        }
        return list;
    }
}