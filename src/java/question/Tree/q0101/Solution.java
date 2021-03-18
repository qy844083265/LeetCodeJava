/*
 * @Author: your name
 * @Date: 2020-07-20 21:15:29
 * @LastEditTime: 2020-07-20 23:44:42
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\Tree\q0101\Solution.java
 */
package java.question.Tree.q0101;

import java.common.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author qinye 给定一个二叉树，检查它是否是镜像对称的。
 */
public class Solution {
	public boolean isSymmetric(TreeNode root) {
		return check(root, root);
	}

	/**
	 * 递归方式
	 * 
	 * @param p
	 * @param q
	 * @return
	 */
	public boolean check(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		}
		if (p == null || q == null) {
			return false;
		}
		return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
	}

	/**
	 * 非递归解决
	 * 
	 * @param p
	 * @param q
	 * @return
	 */
	public boolean checkNoRecurse(TreeNode p, TreeNode q) {
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(p);
		queue.offer(q);
		while (!queue.isEmpty()) {
			TreeNode u = queue.poll();
			TreeNode v = queue.poll();
			if (u == null && v == null) {
				continue;
			}
			if (u == null || v == null || u.val != v.val) {
				return false;
			}
			queue.offer(u.left);
			queue.offer(v.right);
			queue.offer(u.right);
			queue.offer(v.left);
		}
		return true;
	}

}