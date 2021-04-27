/*
 * @Author: your name
 * @Date: 2020-06-29 22:06:29
 * @LastEditTime: 2020-06-29 23:41:06
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\String\q0680\Solution.java
 */
package java.question.String.q0680;

public class Solution {
    public boolean validPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        int left = 0;
        int right = s.length() - 1;
        int[] result = findIndex(left, right, s);
        int left1 = result[0];
        int right1 = result[1];
        if (left1 >= right1) {
            return true;
        }
        int[] result1 = findIndex(left1 + 1, right1, s);
        if (result1[0] >= result1[1]) {
            return true;
        }
        int[] result2 = findIndex(left1, right1 - 1, s);
        if (result2[0] >= result2[1]) {
            return true;
        }
        return false;
    }

    public int[] findIndex(int left, int right, String s) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                break;
            }
            left++;
            right--;
        }
        return new int[] { left, right };
    }
}