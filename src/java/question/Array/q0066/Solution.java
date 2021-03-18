/*
 * @Author: your name
 * @Date: 2020-07-11 13:07:54
 * @LastEditTime: 2020-07-11 13:25:57
 * @LastEditors: your name
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\Array\q0066\Solution.java
 */ 
package java.question.Array.q0066;

public class Solution {
    public int[] plusOne(int[] digits) {
        int extra = 0;
        int index = 1;
        for (int i = digits.length - 1; i > 0; i--) {
            int value = digits[i] + index + extra;
            if (value >= 10) {
                digits[i] = value - 10;
                extra = 1;
                index = 0;
            } else {
                digits[i] = value;
                extra = 0;
                index = 0;
            }
        }
        if (extra == 0) {
            return digits;
        } else {
            int[] newResult = new int[digits.length + 1];
            newResult[0] = 1;
            int k = 1;
            for (int i : digits) {
                newResult[k++] = i;
            }
            return newResult;
        }
    }
}