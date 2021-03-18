/*
 * @Author: your name
 * @Date: 2020-07-04 14:52:40
 * @LastEditTime: 2020-07-11 08:11:25
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\stack\q0394\Solution.java
 */
package java.question.Stack.q0394;

import java.util.Stack;

public class Solution {
    public static String decodeString(String s) {
        Stack<StringBuffer> stack = new Stack<>();
        Stack<Integer> timestack = new Stack<>();
        int time = 0;
        stack.push(new StringBuffer());
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '[') {
                timestack.push(time);
                stack.push(new StringBuffer());
                time = 0;
            } else if (ch == ']') {
                int m = timestack.pop();
                String sb = stack.pop().toString();
                for (int j = 0; j < m; j++) {
                    stack.peek().append(sb);
                }
            } else if (Character.isDigit(ch)) {
                time = 10 * time + ch - '0';
            } else {
                stack.peek().append(ch);
            }
        }
        return stack.pop().toString();
    }

    public static void main(String[] args) {
        System.out.println(decodeString("3[a2[c]]"));
    }
}