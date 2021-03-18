package java.question.BackTracking.q0491;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 给定一个整型数组, 你的任务是找到所有该数组的递增子序列，递增子序列的长度至少是2。
 * 
 * @author qinye
 *
 */
public class Solution {
	List<List<Integer>> result = new ArrayList<>();
	List<Integer> path = new ArrayList<>();

	public List<List<Integer>> findSubsequences(int[] nums) {
		backTrace(0, nums);
		return result;
	}

	private void backTrace(int index, int[] nums) {
		if (path.size() >= 2) {
			result.add(new ArrayList<>(path));
		}
		Set<Integer> set = new HashSet<>();
		for (int i = index; i < nums.length; i++) {
			if ((!path.isEmpty() && path.get(path.size() - 1) > nums[i]) || set.contains(nums[i])) {
				continue;
			}
			set.add(nums[i]);
			path.add(nums[i]);
			backTrace(i + 1, nums);
			path.remove(path.size() - 1);
		}
	}
}
