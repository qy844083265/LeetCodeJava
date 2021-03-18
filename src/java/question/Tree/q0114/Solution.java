/*
 * @Author: your name
 * @Date: 2020-07-21 21:58:51
 * @LastEditTime: 2020-07-21 22:24:47
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\Tree\q0114\Solution.java
 */
package java.question.Tree.q0114;

import java.common.TreeNode;

/**
 * 
 * @author qinye 给定一个二叉树，原地将它展开为一个单链表。
 */
public class Solution {
	public void flatten(TreeNode root) {
		while (root != null) {
			// 左子树为 null，直接考虑下一个节点
			if (root.left == null) {
				root = root.right;
			} else {
				// 找左子树最右边的节点
				TreeNode pre = root.left;
				while (pre.right != null) {
					pre = pre.right;
				}
				// 将原来的右子树接到左子树的最右边节点
				pre.right = root.right;
				// 将左子树插入到右子树的地方
				root.right = root.left;
				root.left = null;
				// 考虑下一个节点
				root = root.right;
			}
		}
	}

	private TreeNode pre = null;

	public void flatRecurse(TreeNode root) {
		if (root == null)
			return;
		flatten(root.right);
		flatten(root.left);
		root.right = pre;
		root.left = null;
		pre = root;
	}
}