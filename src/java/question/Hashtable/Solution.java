package java.question.Hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author qinye 给定一个整数数组和一个整数 k，你需要找到该数组中和为 k 的连续的子数组的个数。 示例 1 : 输入:nums =
 *         [1,1,1], k = 2 输出: 2 , [1,1] 与 [1,1] 为两种不同的情况。 这题和437题很相似
 */
public class Solution {
	public int subarraySum(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		int count = 0;
		int curSum = 0;
		for (int i = 0; i < nums.length; i++) {
			curSum += nums[i];
			if (map.containsKey(curSum - k)) {
				count += map.getOrDefault(curSum - k, 0);
			}
			map.put(curSum, map.getOrDefault(curSum, 0) + 1);
		}
		return count;
	}
}
