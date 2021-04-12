package java.question.DP.q0053;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 
 * @author ribbonsalmark
 *
 */
public class Solution {
	public int maxSubArray(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int n = nums.length;
		int[] dp = new int[n];
		dp[0] = nums[0];
		int result = dp[0];
		for (int i = 1; i < n; i++) {
			dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
			result = Math.max(result, dp[i]);
		}
		return result;
	}
}
