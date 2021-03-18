package java.question.BackTracking.q0126;

import java.util.ArrayList;
import java.util.List;

/**
 * 找出所有相加之和为 n 的 k 个数的组合。组合中只允许含有 1 - 9 的正整数，并且每种组合中不存在重复的数字。
 * 
 * 说明：
 * 
 * 所有数字都是正整数。 解集不能包含重复的组合。
 * 
 * @author qinye
 *
 */
public class Solution {
	public List<List<Integer>> combinationSum3(int k, int n) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> path = new ArrayList<>();
		goBack(result, path, 1, n, k);
		return result;
	}

	public void goBack(List<List<Integer>> result, List<Integer> path, int index, int target, int k) {
		if (path.size() == k || target <= 0) {
			if (path.size() == k && target == 0) {
				result.add(new ArrayList<>(path));
			}
			return;
		}

		for (int i = index; i <= 9; i++) {
			path.add(i);
			goBack(result, path, i + 1, target - i, k);
			path.remove(path.size() - 1);
		}
	}
}
