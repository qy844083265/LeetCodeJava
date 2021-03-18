package java.question.DP.q0377;

/**
 * 给定一个由正整数组成且不存在重复数字的数组，找出和为给定目标正整数的组合的个数。
 *
 * @author ye.qin
 *
 */
public class Solution {
	public int combinationSum4(int[] nums, int target) {
		int[] dp = new int[target + 1];
		dp[0] = 1;
		for (int i = 0; i <= target; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i >= nums[j]) {
					dp[i] += dp[i - nums[j]];
				}
			}
		}
		return dp[target];
	}
}
