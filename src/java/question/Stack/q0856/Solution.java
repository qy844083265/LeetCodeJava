/*
 * @Author: your name
 * @Date: 2020-07-08 22:15:46
 * @LastEditTime: 2020-07-09 00:17:35
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\stack\q0856\Solution.java
 */
package java.question.Stack.q0856;

import java.util.Stack;

public class Solution {
    /**
     * : "(()(()))" 6
     */
    public int scoreOfParentheses(String S) {
        Stack<Integer> stack = new Stack<Integer>();
        int val = 0;
        for (int i = 0; i < S.length(); i++) {
            if (i < S.length() - 1 && S.charAt(i) == '(' && S.charAt(i + 1) == ')') {
                val++;
                i++;
            } else if (S.charAt(i) == '(') {
                stack.push(val);
                val = 0;
            } else {
                val = 2 * val + stack.pop();
            }
        }
        return val;
    }
}