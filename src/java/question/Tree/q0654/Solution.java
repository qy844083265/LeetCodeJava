/*
 * @Author: your name
 * @Date: 2020-07-19 20:31:39
 * @LastEditTime: 2020-07-19 21:21:35
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\Tree\q0654\Solution.java
 */
package java.question.Tree.q0654;

import java.common.TreeNode;

/**
 * 给定一个不含重复元素的整数数组。一个以此数组构建的最大二叉树定义如下：
 * 
 * 二叉树的根是数组中的最大元素。 左子树是通过数组中最大值左边部分构造出的最大二叉树。 右子树是通过数组中最大值右边部分构造出的最大二叉树。
 * 
 * 通过给定的数组构建最大二叉树，并且输出这个树的根节点。
 * 
 * @author qinye
 *
 */
public class Solution {
	public TreeNode constructMaximumBinaryTree(int[] nums) {
		return helper(nums, 0, nums.length - 1);
	}

	public int findMaxIndex(int[] nums, int left, int right) {
		int max = 0;
		int index = left;
		for (int i = left; i <= right; i++) {
			if (nums[i] > max) {
				index = i;
				max = nums[i];
			}
		}
		return index;
	}

	public TreeNode helper(int[] nums, int left, int right) {
		if (left > right) {
			return null;
		}
		int index = findMaxIndex(nums, left, right);
		TreeNode node = new TreeNode(nums[index]);
		node.left = helper(nums, left, index - 1);
		node.right = helper(nums, index + 1, right);
		return node;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 3, 2, 1, 6, 0, 5 };
		Solution solution = new Solution();
		int index = solution.findMaxIndex(nums, 0, 5);
		System.out.println(index);
	}
}