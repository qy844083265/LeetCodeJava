/*
 * @Author: your name
 * @Date: 2020-07-13 21:56:50
 * @LastEditTime: 2020-07-14 22:25:25
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\Array\q0442\Solution.java
 */ 
package java.question.Array.q0442;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; ++i) {
            int n = Math.abs(nums[i]);
            if (nums[n - 1] < 0)
                list.add(n);
            else
                nums[n - 1] = -1 * nums[n - 1];
        }

        return list;
    }

    public static void main(String[] args) {
        int[] a = new int[] { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> list = findDuplicates(a);
        list.stream().forEach( t -> System.out.println(t));
    }
}