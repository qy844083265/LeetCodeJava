/*
 * @Author: your name
 * @Date: 2020-07-08 23:17:02
 * @LastEditTime: 2020-07-09 00:03:50
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\stack\q0145\Solution.java
 */
package java.question.Stack.q0145;

import java.common.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * 递归做法
     * 
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        recurse(root, list);
        return list;
    }

    public void recurse(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        recurse(node.left, list);
        recurse(node.right, list);
        list.add(node.val);
    }

    /**
     * 非递归做法
     */
    public List<Integer> postorderTraversalNoRecurse(TreeNode root) {
        return null;
    }
}