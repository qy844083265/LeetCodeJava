/*
 * @Author: your name
 * @Date: 2020-07-05 20:42:28
 * @LastEditTime: 2020-07-05 23:04:26
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\stack\q0496\Solution.java
 */
package java.question.Stack.q0496;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = nums2.length - 1; i >= 0; i--) {
            int value = nums2[i];
            while (!stack.isEmpty() && value > stack.peek()) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                map.put(value, -1);
            } else if (stack.peek() > value) {
                map.put(value, stack.peek());
            }
            stack.push(value);
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = map.getOrDefault(nums1[i], -1);
        }
        return result;
    }
}