/*
 * @Author: your name
 * @Date: 2020-07-07 23:31:06
 * @LastEditTime: 2020-07-07 23:58:24
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\stack\q0503\Solution.java
 */
package java.question.Stack.q0503;

import java.util.Stack;

public class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--)
            stack.push(nums[i]);
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.empty() && stack.peek() <= nums[i])
                stack.pop();
            if (stack.empty())
                result[i] = -1;
            else
                result[i] = stack.peek();
            stack.push(nums[i]);
        }
        return result;

    }
}