/*
 * @Author: your name
 * @Date: 2020-06-26 18:55:38
 * @LastEditTime: 2020-06-26 20:11:42
 * @LastEditors: your name
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\String\q0049\Solution.java
 */ 
package java.question.String.q0049;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String item : strs) {
            char[] ch = item.toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            if (map.containsKey(s)) {
                List<String> list = map.get(s);
                list.add(item);
                map.put(s, list);
            } else {
                List<String> list = new ArrayList<>();
                list.add(item);
                map.put(s, list);
            }
        }
        return new ArrayList<>(map.values());
    }
}