/*
 * @Author: your name
 * @Date: 2020-07-11 08:12:30
 * @LastEditTime: 2020-07-11 12:22:39
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\Array\q0238\Solution.java
 */
package java.question.Array.q0238;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int m = 1;
        for (int i = 0; i < res.length; i++) {
            res[i] = m;
            m = m * nums[i];
        }
        m = 1;
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = res[i] * m;
            m *= nums[i];
        }
        return res;
    }
}