/*
 * @Author: your name
 * @Date: 2020-06-16 22:32:34
 * @LastEditTime: 2020-06-26 15:02:34
 * @LastEditors: your name
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\String\q0020\Solution.java
 */ 
package java.question.String.q0020;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    

    public boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();
        if (s.length() == 0 || s == null) {
            return true;
        }
        if (s.length() % 2 != 0) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (myStack.isEmpty() || !map.containsKey(c)) {
                myStack.add(c);
            }
            if (map.containsKey(c) && map.get(c) == myStack.peek()) {
                myStack.pop();
            }
        }
        return myStack.isEmpty();
    }
}