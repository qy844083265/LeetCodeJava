/*
 * @Author: your name
 * @Date: 2020-06-26 15:03:04
 * @LastEditTime: 2020-06-26 18:17:50
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\String\q1249\Solution.java
 */
package java.question.String.q1249;

import java.util.Stack;

public class Solution {
    public String minRemoveToMakeValid(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        Stack<Integer> myStack = new Stack<>();
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '(') {
                myStack.push(i);
            }
            if (ch[i] == ')') {
                if (!myStack.isEmpty()) {
                    myStack.pop();
                } else {
                    ch[i] = ' ';
                }
            }

        }
        while (!myStack.isEmpty()) {
            ch[myStack.pop()] = ' ';
        }
        return String.valueOf(ch).replaceAll(" ", "");
    }
}