package java.question.Greedy.q0135;

import java.util.Arrays;

/**
 * 
 * @author qinye 老师想给孩子们分发糖果，有 N 个孩子站成了一条直线，老师会根据每个孩子的表现，预先给他们评分。
 * 
 *         你需要按照以下要求，帮助老师给这些孩子分发糖果：
 * 
 *         每个孩子至少分配到 1 个糖果。 相邻的孩子中，评分高的孩子必须获得更多的糖果。
 * 
 *         那么这样下来，老师至少需要准备多少颗糖果呢？
 */
public class Solution {
	public int candy(int[] ratings) {
		int[] can = new int[ratings.length];
		Arrays.fill(can, 1);
		for (int i = 1; i < can.length; i++) {
			// 从前向后
			if (ratings[i] > ratings[i - 1]) {
				can[i] = can[i - 1] + 1;
			}
		}
		// 从后向前
		for (int j = can.length - 2; j >= 0; j--) {
			if (ratings[j] > ratings[j + 1]) {
				can[j] = Math.max(can[j], can[j + 1] + 1);
			}
		}
		int result = 0;
		for (int i : can) {
			result += i;
		}
		return result;
	}
}
