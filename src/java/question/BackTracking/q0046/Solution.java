package java.question.BackTracking.q0046;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author qinye 给定一个 没有重复 数字的序列，返回其所有可能的全排列。
 */
public class Solution {
	List<List<Integer>> result = new ArrayList<>();
	List<Integer> path = new ArrayList<>();

	public List<List<Integer>> permute(int[] nums) {
		if (nums == null || nums.length == 0) {
			return result;
		}
		boolean[] used = new boolean[nums.length];
		dfs(nums, 0, used);
		return result;
	}

	public void dfs(int[] nums, int index, boolean[] used) {
		if (index >= nums.length) {
			result.add(new ArrayList<>(path));
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if (!used[i]) {
				used[i] = true;
				path.add(nums[i]);
				dfs(nums, index + 1, used);
				path.remove(path.size() - 1);
				used[i] = false;
			}
		}
	}
}
