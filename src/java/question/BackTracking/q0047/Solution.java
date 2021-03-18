package java.question.BackTracking.q0047;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author qinye 给定一个可包含重复数字的序列，返回所有不重复的全排列
 */
public class Solution {
	List<List<Integer>> result = new ArrayList<>();
	List<Integer> path = new ArrayList<>();

	public List<List<Integer>> permuteUnique(int[] nums) {
		if (nums == null || nums.length == 0) {
			return result;
		}
		Arrays.sort(nums);
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
				if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
					continue;
				}
				used[i] = true;
				path.add(nums[i]);
				dfs(nums, index + 1, used);
				path.remove(path.size() - 1);
				used[i] = false;
			}
		}
	}
}
