package java.question.BackTracking.q0078;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author qinye 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。 说明：解集不能包含重复的子集。
 */
public class Solution {
	List<List<Integer>> result = new ArrayList<>();
	List<Integer> path = new ArrayList<>();

	public List<List<Integer>> subsets(int[] nums) {
		backtracking(nums, 0);
		return result;
	}

	private void backtracking(int[] nums, int index) {
		result.add(new ArrayList<>(path));
		if (index >= nums.length) {
			return;
		}
		for (int i = index; i < nums.length; i++) {
			path.add(nums[i]);
			backtracking(nums, i+1);
			path.remove(path.size()-1);
		}
	}
}
