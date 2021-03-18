package java.question.Greedy.q0738;

/**
 * 给定一个非负整数 N，找出小于或等于 N 的最大的整数，同时这个整数需要满足其各个位数上的数字是单调递增。
 * （当且仅当每个相邻位数上的数字 x 和 y 满足 x <= y 时，我们称这个整数是单调递增的。）
 *
 * @author ye.qin
 *
 */
public class Solution {
	public int monotoneIncreasingDigits(int N) {
		char[] ch = String.valueOf(N).toCharArray();
		int result = 0;
		int flag = ch.length;
		for (int i = ch.length - 1; i > 0; i--) {
			if (ch[i - 1] - ch[i] > 0) {
				ch[i - 1] = String.valueOf(ch[i - 1] - '1').toCharArray()[0];
				flag = i;
			}
		}
		for (int i = flag; i < ch.length; i++) {
			ch[i] = '9';
		}
		result = Integer.valueOf(String.valueOf(ch));
		return result;
	}

	public static void main(String[] args) {
		System.out.println(new Solution().monotoneIncreasingDigits(300));
	}
}
