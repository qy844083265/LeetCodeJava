package java.question.DP.q0070;

/**
 *
 * @author qinye 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 *         每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 */
public class Solution {
	public int climbStairs(int n) {
		if (n <= 2) {
			return n;
		}
		int[] dp = new int[2];
		dp[0] = 1;
		dp[1] = 2;
		for (int i = 2; i <= n; i++) {
			int sum = dp[0] + dp[1];
			dp[0] = dp[1];
			dp[1] = sum;
		}
		return dp[0];
	}

	public int climbStairs1(int n) {
		int m = 2;
		int[] dp = new int[n + 1];
		dp[0] = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (i - j >= 0) {
					dp[i] += dp[i - j];
				}
			}
		}
		return dp[n];
	}
}
