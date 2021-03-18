/*
 * @Author: your name
 * @Date: 2020-06-27 10:59:12
 * @LastEditTime: 2020-06-27 12:27:29
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\String\q0767\Solution.java
 */ 
package java.question.String.q0767;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public String reorganizeString(String S) {
        char[] ch = S.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : ch) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                int count = map.get(c);
                count++;
                map.put(c, count);
            }
        }
        List<Character> list = new ArrayList<>(map.keySet());
        int count0 = map.get(list.get(0));
        int count1 = map.get(list.get(1));
        if (count0 - count1 > 1 || count1 - count0 > 1) {
            return "";
        }
        if (count0 > count1) {

        }
        return null;
    }
}