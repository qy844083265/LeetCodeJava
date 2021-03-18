package java.question.Array.q0011;

public class Solution {
	public int maxArea(int[] height) {
		int start = 0;
		int end = height.length-1;
		int max = 0;
		while (start < end) {
			int area = 0;
			if (height[start] < height[end]) {
				int h = height[start];
				int width = end - start;
				area = h * width;
				start++;
			}else {
				int h = height[end];
				int width = end -start;
				area = h* width;
				end--;
			}
			max = Math.max(max, area);
		}

		return max;

	}

	public static void main(String[] args) {

	}

}
