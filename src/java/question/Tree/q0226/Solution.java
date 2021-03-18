/*
 * @Author: your name
 * @Date: 2020-07-15 23:47:36
 * @LastEditTime: 2020-07-16 00:08:23
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\Tree\q0226\Solution.java
 */
package java.question.Tree.q0226;

import java.common.TreeNode;

/**
 * 
 * @author qinye 翻转一棵二叉树。
 */
public class Solution {
	TreeNode node;

	public TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return null;
		}
		node = root.left;
		root.left = root.right;
		root.right = node;
		invertTree(root.left);
		invertTree(root.right);
		return root;

	}
}