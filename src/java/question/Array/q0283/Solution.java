/*
 * @Author: your name
 * @Date: 2020-07-11 14:36:17
 * @LastEditTime: 2020-07-11 14:49:25
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\Array\q0283\Solution.java
 */
package java.question.Array.q0283;

public class Solution {
    public void moveZeroes(int[] nums) {
        int lo = 0;
        int cur = 0;
        while (cur < nums.length) {
            if (nums[cur] != 0) {
                int temp = nums[lo];
                nums[lo] = nums[cur];
                nums[cur] = temp;
                lo++;
            }
            cur++;
        }
    }
}