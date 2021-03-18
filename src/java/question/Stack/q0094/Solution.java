/*
 * @Author: your name
 * @Date: 2020-07-05 16:29:00
 * @LastEditTime: 2020-07-08 00:01:04
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\stack\q0094\Solution.java
 */
package java.question.Stack.q0094;

import java.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 给定一个二叉树，返回它的中序 遍历。
 */
/**
 * 递归
 */
public class Solution {
	Stack<TreeNode> stack = new Stack<>();

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		middle(root);
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			middle(node.right);
			list.add(node.val);
		}
		return list;
	}

	public void middle(TreeNode node) {
		while (node != null) {
			stack.push(node);
			node = node.left;
		}
	}
}