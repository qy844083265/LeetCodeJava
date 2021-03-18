/*
 * @Author: your name
 * @Date: 2020-07-11 07:53:57
 * @LastEditTime: 2020-07-11 08:09:30
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\Array\q0121\Solution.java
 */
package java.question.Array.q0121;

public class Solution {
    public int maxProfit(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int currMin = arr[0];
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i] - currMin);
            currMin = currMin <= arr[i] ? currMin : arr[i];
        }
        return max > 0 ? max : 0;
    }
}