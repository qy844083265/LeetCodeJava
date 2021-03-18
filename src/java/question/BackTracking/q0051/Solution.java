package java.question.BackTracking.q0051;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个整数 n，返回所有不同的 n 皇后问题的解决方案。 每一种解法包含一个明确的 n 皇后问题的棋子放置方案，该方案中 'Q' 和 '.'
 * 分别代表了皇后和空位。
 * 
 * @author qinye
 *
 */
class Solution {
	public List<List<String>> solveNQueens(int n) {
		List<List<String>> result = new ArrayList<>();
		List<char[]> board = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			char[] chars = new char[n];
			Arrays.fill(chars, '.');
			board.add(chars);
		}
		backtracking(n, 0, board, result);
		return result;
	}

	private void backtracking(int n, int row, List<char[]> board, List<List<String>> result) {
		if (n == row) {
			List<String> path = new ArrayList<>();
			for (char[] chars : board) {
				path.add(new String(chars));
			}
			result.add(path);
			return;
		}
		for (int col = 0; col < n; col++) {
			if (isValid(row, col, n, board)) {
				board.get(row)[col] = 'Q';
				backtracking(n, row + 1, board, result);
				board.get(row)[col] = '.';
			}
		}

	}

	private boolean isValid(int row, int col, int n, List<char[]> board) {
		for (int i = 0; i < row; i++) {
			if (board.get(i)[col] == 'Q') {
				return false;
			}
		}
		for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
			if (board.get(i)[j] == 'Q') {
				return false;
			}
		}
		for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
			if (board.get(i)[j] == 'Q') {
				return false;
			}
		}
		return true;
	}
}
