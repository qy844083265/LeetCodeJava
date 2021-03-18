package java.question.BackTracking.q0077;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
 * 
 * @author qinye
 *
 */
public class Solution {
	List<List<Integer>> result = new ArrayList<>();
	List<Integer> path = new ArrayList<>();

	public List<List<Integer>> combine(int n, int k) {
		backtracking(n, k, 1);
		return result;
	}

	private void backtracking(int n, int k, int index) {
		if (path.size() >= k) {
			result.add(new ArrayList<>(path));
			return;
		}
		for (int i = index; i <= n; i++) {
			path.add(i);
			backtracking(n, k, i + 1);
			path.remove(path.size() - 1);
		}
	}
}
