package java.question.DP.q0115;

/**
 * 
 * @author ribbonsalmark 给定一个字符串 s 和一个字符串 t ，计算在 s 的子序列中 t 出现的个数。
 * 
 *         字符串的一个 子序列
 *         是指，通过删除一些（也可以不删除）字符且不干扰剩余字符相对位置所组成的新字符串。（例如，"ACE" 是 "ABCDE" 的一个子序列，而 "AEC" 不是）
 */
public class Solution {
	public int numDistinct(String s, String t) {
		int m = s.length();
		int n = t.length();
		int[][] dp = new int[m+1][n+1];
		for (int i = 0; i <= m; i++) {
			dp[i][0] = 1;
		}
		for (int i = 1; i <= n; i++) {
			dp[0][n] = 0;

		}
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (s.charAt(i - 1) == t.charAt(j-1)) {
					dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}
		return dp[m][n];
	}
}
