package java.question.Stack.q0739;

import java.util.Stack;

public class Solution {
    // [73, 74, 75, 71, 69, 72, 76, 73]
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[t.length];

        for (int i = t.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && t[i] >= t[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result[i] = -1;
                //result[i] = 0;
            } else {
                result[i] = t[stack.peek()];
                // result[i] = stack.peek() - i;
            }
            stack.push(i);
        }
        return result;
    }
}