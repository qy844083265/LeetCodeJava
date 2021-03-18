package java.question.BackTracking.q0090;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author qinye 给定一个可能包含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 */
public class Solution {
	private static final boolean BOOLEAN = false;
	List<List<Integer>> result = new ArrayList<>();
	List<Integer> path = new ArrayList<>();

	public List<List<Integer>> subsetsWithDup(int[] nums) {
		Arrays.sort(nums);
		boolean[] used = new boolean[nums.length];
		backtracking(nums, 0, used);
		return result;
	}

	private void backtracking(int[] nums, int index, boolean[] used) {
		result.add(new ArrayList<>(path));
		for (int i = index; i < nums.length; i++) {
			if (i > 0 && nums[i] == nums[i - 1] && used[i - 1] == BOOLEAN) {
				continue;
			}
			path.add(nums[i]);
			used[i] = true;
			backtracking(nums, i + 1, used);
			used[i] = false;
			path.remove(path.size() - 1);
		}
	}
}
