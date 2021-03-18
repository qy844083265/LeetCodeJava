package java.question.DP.q0509;

/**
 * 斐波那契数，通常用 F(n) 表示，形成的序列称为 斐波那契数列 。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：
 *
 * F(0) = 0，F(1) = 1 F(n) = F(n - 1) + F(n - 2)，其中 n > 1
 *
 * @author ye.qin
 *
 */
public class Solution {
	public int fib(int n) {
		if (n <= 1) {
			return n;
		}
		int[] dp = new int[2];
		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			int sum = dp[0] + dp[1];
			dp[0] = dp[1];
			dp[1] = sum;
		}
		return dp[1];
	}
}
