/*
 * @Author: your name
 * @Date: 2020-07-05 17:05:46
 * @LastEditTime: 2020-07-05 20:07:38
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\stack\q0094\SolutionNoRecurse.java
 */
package java.question.Stack.q0094;

import java.common.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SolutionNoRecurse {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if (root == null) {
            return list;
        }
        TreeNode p = root;
        while (!stack.isEmpty() || p != null) {
            if (p != null) {
                stack.push(p);
                p = p.left;
            } else {
                p = stack.pop();
                list.add(p.val);
                p = p.right;
            }

        }
        return list;
    }
}