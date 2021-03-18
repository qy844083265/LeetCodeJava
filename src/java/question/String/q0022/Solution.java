/*
 * @Author: your name
 * @Date: 2020-06-26 14:38:03
 * @LastEditTime: 2020-06-26 15:02:51
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\String\q022\Solution.java
 */ 
package java.question.String.q0022;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(result, "", n, n);
        return result;
    }

    public void generate(List<String> result, String subString, int left, int right) {
        if (left == 0 && right == 0) {
            result.add(subString);
            return;
        }
        if (left > 0) {
            generate(result, subString + "(", left - 1, right);
        }
        if (right > left) {
            generate(result, subString + ")", left, right - 1);
        }
    }
}