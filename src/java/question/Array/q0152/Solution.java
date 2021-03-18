/*
 * @Author: your name
 * @Date: 2020-07-11 17:40:33
 * @LastEditTime: 2020-07-11 19:27:08
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\Array\q0152\Solution.java
 */
package java.question.Array.q0152;

public class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int curMax;
        int curMin;
        int preMax = nums[0];
        int preMin = nums[0];
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= 0) {
                curMax = preMax >= 0 ? preMax * nums[i] : nums[i];
                curMin = preMin < 0 ? preMin * nums[i] : nums[i];
            } else {
                curMax = preMin < 0 ? preMin * nums[i] : nums[i];
                curMin = preMax >= 0 ? preMax * nums[i] : nums[i];
            }
            preMax = curMax;
            preMin = curMin;
            result = Math.max(result, curMax);
        }
        return result;
    }
}