/*
 * @Author: your name
 * @Date: 2020-07-11 12:46:37
 * @LastEditTime: 2020-07-11 13:06:10
 * @LastEditors: your name
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\Array\q0169\Solution.java
 */ 
package java.question.Array.q0169;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int n : nums) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
                if (map.get(n) > nums.length / 2) {
                    result = n;
                }
            } else {
                map.put(n, 1);
            }

        }
        return result;
    }
    public int majorityElementEx(int[] nums){
        if (nums.length == 1){
            return nums[0];
        }
        List<Integer> list = new ArrayList<>();
        for (int n : nums) {
            list.add(n);
        }
        Collections.sort(list);
        int result = 1;
        int a = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(list.get(i-1))){
                result++;
                if (result > list.size()/2){
                    a = list.get(i);
                }
            }else {
                result = 1;
            }
        }
        return a;
    }
}