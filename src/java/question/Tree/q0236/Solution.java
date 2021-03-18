/*
 * @Author: your name
 * @Date: 2020-07-20 20:32:34
 * @LastEditTime: 2020-07-20 20:58:40
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\Tree\q0236\Solution.java
 */
package java.question.Tree.q0236;

import java.common.TreeNode;

/**
 * 
 * @author qinye 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 * 
 *         百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x
 *         的深度尽可能大（一个节点也可以是它自己的祖先）。”
 * 
 */
public class Solution {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null || root == p || root == q) {
			return root;
		}
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);
		return left == null ? right : right == null ? left : root;
	}
}