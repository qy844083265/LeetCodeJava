package java.question.Array.q0054;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class solution {
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new ArrayList<>();
		int left = 0;
		int right = matrix[0].length - 1;
		int top = 0;
		int bottom = matrix.length - 1;
		int nums = matrix[0].length * matrix.length;
		while (nums > 0) {
			for (int i = 0; i <= right && nums > 0; i++) {
				result.add(matrix[top][i]);
				nums--;
			}
			top++;
			for (int i = top; i <= bottom && nums > 0; i++) {
				result.add(matrix[i][right]);
				nums--;
			}
			right--;
			for (int i = right; i >= left && nums > 0; i--) {
				result.add(matrix[bottom][i]);
				nums--;
			}
			bottom--;
			for (int i = bottom; i >= top && nums > 0; i--) {
				result.add(matrix[i][left]);
				nums--;
			}

		}
		return result;
	}

}
