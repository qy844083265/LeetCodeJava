/*
 * @Author: your name
 * @Date: 2020-06-27 18:28:02
 * @LastEditTime: 2020-06-28 23:10:35
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\String\q0067\Solution.java
 */ 
package java.question.String.q0067;

public class Solution {
    public String addBinary(String a, String b) {
        int al = a.length() - 1;
        int bl = b.length() - 1;
        int extra = 0;
        StringBuffer sb = new StringBuffer();
        while (al > 0 && bl > 0) {
            int inta = a.charAt(al) - '0';
            int intb = b.charAt(bl) - '0';
            if (inta + intb + extra> 1) {
                sb.append("0");
                extra = 1;
            }else{
                sb.append(String.valueOf(inta + intb + extra));
                extra = 0;
            }
        }
        return null;
    }
}