/*
 * @Author: your name
 * @Date: 2020-07-19 14:10:29
 * @LastEditTime: 2020-07-19 15:03:26
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\Tree\q0108\Solution.java
 */
package java.question.Tree.q0108;

import java.common.TreeNode;

/**
 * 
 * @author qinye 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 * 
 *         本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 */
public class Solution {
	public TreeNode sortedArrayToBST(int[] nums) {
		TreeNode root = buildNode(nums, 0, nums.length - 1);
		return root;
	}

	public TreeNode buildNode(int[] nums, int left, int right) {
		if (left > right) {
			return null;
		}
		int middle = (left + right) / 2;
		TreeNode node = new TreeNode(nums[middle]);
		node.left = buildNode(nums, left, middle - 1);
		node.right = buildNode(nums, middle + 1, right);
		return node;
	}
}