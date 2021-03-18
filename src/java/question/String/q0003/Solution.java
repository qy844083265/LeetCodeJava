/*
 * @Author: your name
 * @Date: 2020-06-22 23:29:26
 * @LastEditTime: 2020-07-11 08:05:26
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\String\q0003\Solution.java
 */
package java.question.String.q0003;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = Integer.MIN_VALUE;
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            String str = "" + s.charAt(i);
            if (result.contains(str)) {
                int index = result.indexOf(str);
                result = result.substring(index + 1);
            }
            result = result + str;
            max = Math.max(max, result.length());
        }
        if (max == Integer.MIN_VALUE) {
            return 0;
        }
        return max;
    }

    public int lengthOfLongestSubstring01(String s) {
        int left = 0;
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                int index = map.get(c);
                left = Math.max(left, index + 1);
                map.put(c, i);
                max = Math.max(max, i - left + 1);

            } else {
                map.put(c, i);
                max = Math.max(max, i - left + 1);
            }
        }
        return max;
    }
}