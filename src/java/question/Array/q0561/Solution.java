/*
 * @Author: your name
 * @Date: 2020-07-11 12:27:03
 * @LastEditTime: 2020-07-11 12:53:02
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\Array\q0561\Solution.java
 */
package java.question.Array.q0561;

import java.util.Arrays;

public class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i += 2) {

            result += nums[i];

        }
        return result;
    }
}