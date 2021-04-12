package java.question.DP.q1035;

/**
 * 我们在两条独立的水平线上按给定的顺序写下 A 和 B 中的整数。
 * 
 * 现在，我们可以绘制一些连接两个数字 A[i] 和 B[j] 的直线，只要 A[i] == B[j]，且我们绘制的直线不与任何其他连线（非水平线）相交。
 * 
 * 以这种方法绘制线条，并返回我们可以绘制的最大连线数。
 * 
 * @author ribbonsalmark
 *
 */
public class Solution {
	public int maxUncrossedLines(int[] A, int[] B) {
		int m = A.length;
		int n = B.length;
		int[][] dp = new int[m + 1][n + 1];
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (A[i - 1] == B[j - 1]) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
		return dp[m][n];
	}
}
