/*
 * @Author: your name
 * @Date: 2020-07-05 13:03:54
 * @LastEditTime: 2020-07-05 13:26:20
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\stack\q0394\Solution01.java
 */ 
package java.question.Stack.q0394;

public class Solution01 {
    public static String decodeString(String s) {
        return dfs(0, s).str;
    }

    public static Tuple dfs(int index, String str) {
        StringBuffer sb = new StringBuffer();
        Tuple tuple = null;
        int times = 0;
        char c = ' ';
        for (; index < str.length(); index++) {
            c = str.charAt(index);
            if (c == '[') {
                index = index + 1;
                tuple = dfs(index, str);
                for (; times > 0; times--) {
                    sb.append(tuple.str);
                }
                index = tuple.index;
            } else if (c == ']') {
                return new Tuple(index, sb.toString());
            } else if (c >= '0' && c <= '9') {
                times = 10 * times + c - '0';
            } else {
                sb.append(c);
            }
        }
        return new Tuple(index, sb.toString());
    }

}

class Tuple {
    int index;
    String str;

    public Tuple(int index, String str) {
        this.index = index;
        this.str = str;
    }

}