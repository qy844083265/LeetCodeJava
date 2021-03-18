/*
 * @Author: your name
 * @Date: 2020-06-26 23:25:37
 * @LastEditTime: 2020-06-27 00:20:46
 * @LastEditors: your name
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\String\q0012\Solution.java
 */ 
package java.question.String.q0012;

public class Solution {
    public String intToRoman(int num) {
        int[] values = { 100, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] strs = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < strs.length; i++) {
            while (num >= values[i]) {
                num = num - values[i];
                sb.append(strs[i]);
            }
        }
        return sb.toString();
    }
}