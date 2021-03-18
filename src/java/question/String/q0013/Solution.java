/*
 * @Author: your name
 * @Date: 2020-06-30 22:27:31
 * @LastEditTime: 2020-07-01 23:47:18
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\String\q0013\Solution.java
 */
package java.question.String.q0013;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = map.get(s.charAt(i));
            if (i != s.length() - 1 && value < map.get(s.charAt(i + 1)) ) {
                sum -= value;
            } else {
                sum += value;
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}