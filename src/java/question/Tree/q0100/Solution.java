/*
 * @Author: your name
 * @Date: 2020-07-11 08:10:40
 * @LastEditTime: 2020-07-11 08:11:15
 * @LastEditors: your name
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\Tree\q0100\Solution.java
 */
package java.question.Tree.q0100;

import java.common.TreeNode;

/**
 * 
 * @author qinye 给定两个二叉树，编写一个函数来检验它们是否相同。
 * 
 *         如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 */
public class Solution {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null || q == null) {
			return q == p;
		}
		if (p.val != q.val) {
			return false;
		}
		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}
}