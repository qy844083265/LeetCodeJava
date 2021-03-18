/*
 * @Author: your name
 * @Date: 2020-07-04 11:23:45
 * @LastEditTime: 2020-07-04 11:36:10
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\stack\q0155\MinStack.java
 */
package java.question.Stack.q0155;

import java.util.Stack;

public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        if (stack.isEmpty()) {
            stack.push(x);
            minStack.push(x);
        } else {
            stack.push(x);
            if (minStack.peek() <= x) {
                minStack.push(minStack.peek());
            } else {
                minStack.push(x);
            }
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
            minStack.pop();
            stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}