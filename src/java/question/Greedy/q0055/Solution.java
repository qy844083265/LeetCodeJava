package java.question.Greedy.q0055;

/**
 * 给定一个非负整数数组，你最初位于数组的第一个位置。
 * 
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * 
 * 判断你是否能够到达最后一个位置。
 * 
 * @author qinye
 *
 */
public class Solution {
	public boolean canJump(int[] nums) {
		int cover = 0;
		if (nums.length == 1) {
			return true;
		}
		for (int i = 0; i <= cover; i++) {
			cover = Math.max(i + nums[i], cover);
			if (cover >= nums.length - 1) {
				return true;
			}
		}
		return false;
	}
}
