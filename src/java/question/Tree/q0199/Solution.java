/*
 * @Author: your name
 * @Date: 2020-07-19 22:33:34
 * @LastEditTime: 2020-07-19 23:00:21
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\Tree\q0199\Solution.java
 */
package java.question.Tree.q0199;

import java.common.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 
 * @author qinye 给定一棵二叉树，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。
 */
public class Solution {
	public List<Integer> rightSideView(TreeNode root) {
		if (root == null) {
			return null;
		}
		List<Integer> result = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.poll();
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
				if (i == size - 1) {
					result.add(node.val);
				}

			}
		}
		return result;
	}
}