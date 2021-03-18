package java.question.BackTracking.q0040;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author qinye 给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为
 *         target 的组合。
 * 
 *         candidates 中的每个数字在每个组合中只能使用一次。
 */
public class Solution {
	List<List<Integer>> result = new ArrayList<>();
	List<Integer> path = new ArrayList<>();

	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		Arrays.sort(candidates);
		boolean[] used = new boolean[candidates.length];
		backtracking(candidates, 0, target, 0, used);
		return result;
	}

	private void backtracking(int[] nums, int index, int target, int sum, boolean[] used) {
		if (sum > target) {
			return;
		}
		if (sum == target) {
			result.add(new ArrayList<>(path));
			return;
		}
		for (int i = index; i < nums.length && sum + nums[i] <= target; i++) {
			if (i > 0 && nums[i] == nums[i - 1] && used[i - 1] == false) {
				continue;
			}
			sum += nums[i];
			path.add(nums[i]);
			used[i] = true;
			backtracking(nums, i + 1, target, sum, used);
			used[i] = false;
			sum -= nums[i];
			path.remove(path.size() - 1);
		}
	}
}
