package java.question.BackTracking.q0131;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author qinye 给定一个字符串 s，将 s 分割成一些子串，使每个子串都是回文串。 返回 s 所有可能的分割方案。
 */
public class Solution {
	List<List<String>> result = new ArrayList<>();
	List<String> path = new ArrayList<>();

	public List<List<String>> partition(String s) {
		if (s == null || s.length() == 0) {
			return result;
		}
		backtracking(s, 0);
		return result;
	}

	private void backtracking(String s, int index) {
		if (index >= s.length()) {
			result.add(new ArrayList<>(path));
			return;
		}
		for (int i = index; i < s.length(); i++) {
			if (isPalindrome(s, index, i)) {
				String subString = s.substring(index, i + 1);
				path.add(subString);
			} else {
				continue;
			}
			backtracking(s, i + 1);
			path.remove(path.size() - 1);
		}
	}

	private boolean isPalindrome(String s, int start, int end) {
		for (int i = start, j = end; i < j; i++, j--) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		return true;
	}
}
