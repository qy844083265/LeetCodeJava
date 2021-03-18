/*
 * @Author: your name
 * @Date: 2020-07-19 23:07:37
 * @LastEditTime: 2020-07-20 00:16:46
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\Tree\q0110\Solution.java
 */
package java.question.Tree.q0110;

import java.common.TreeNode;

/**
 * 
 * @author qinye 给定一个二叉树，判断它是否是高度平衡的二叉树。
 * 
 *         本题中，一棵高度平衡二叉树定义为：
 * 
 *         一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
 * 
 */
public class Solution {
	// Recursively obtain the height of a tree. An empty tree has -1 height
	private int height(TreeNode root) {
		// An empty tree has height -1
		if (root == null) {
			return -1;
		}
		return 1 + Math.max(height(root.left), height(root.right));
	}

	public boolean isBalanced(TreeNode root) {
		// An empty tree satisfies the definition of a balanced tree
		if (root == null) {
			return true;
		}
		// Check if subtrees have height within 1. If they do, check if the
		// subtrees are balanced
		return Math.abs(height(root.left) - height(root.right)) < 2 && isBalanced(root.left) && isBalanced(root.right);
	}
}