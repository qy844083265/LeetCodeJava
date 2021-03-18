package java.question.BackTracking.q0039;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author qinye 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为
 *         target 的组合。 candidates 中的数字可以无限制重复被选取。
 */
public class Solution {
	List<List<Integer>> result = new ArrayList<>();
	List<Integer> path = new ArrayList<>();

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);
		backtracking(candidates, 0, target, 0);
		return result;
	}

	private void backtracking(int[] nums, int index, int target, int sum) {
		if (sum > target) {
			return;
		}
		if (sum == target) {
			result.add(new ArrayList<>(path));
			return;
		}
		for (int i = index; i < nums.length && sum + nums[i] <= target; i++) {
			sum += nums[i];
			path.add(nums[i]);
			backtracking(nums, i, target, sum);
			sum -= nums[i];
			path.remove(path.size() - 1);
		}
	}
}
