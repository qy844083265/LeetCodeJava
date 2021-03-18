package java.question.Greedy.q0053;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 
 * @author qinye
 *
 */
public class Solution {
	public int maxSubArray(int[] nums) {
		int result = Integer.MIN_VALUE;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			count += nums[i];
			if (count > result) {
				result = count;
			}
			if (count < 0) {
				count = 0;
			}
		}
		return result;
	}
}
