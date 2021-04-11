package java.question.DP.q0392;

/**
 * 
 * @author ribbonsalmark 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
 * 
 *         字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。
 *         （例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
 * 
 *         进阶：
 * 
 *         如果有大量输入的 S，称作 S1, S2, ... , Sk 其中 k >= 10亿，你需要依次检查它们是否为 T
 *         的子序列。在这种情况下，你会怎样改变代码？
 */
public class Solution {
	public boolean isSubsequence(String s, String t) {
		int m = s.length();
		int n = t.length();
		int[][] dp = new int[m+1][n+1];
		for (int i = 1; i <= m ;i++) {
			for (int j = 1; j <= n; j++) {
				if (s.charAt(i-1) == t.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1] +1;
				}else {
					dp[i][j] = dp[i][j-1];
				}
			}
		}
		//长度等于原始字符串的长度说明存在
		if (dp[m][n] == s.length()) {
			return true;
		}
		return false;
	}
}
