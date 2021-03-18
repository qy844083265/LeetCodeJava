/*
 * @Author: your name
 * @Date: 2020-07-08 23:01:39
 * @LastEditTime: 2020-07-08 23:14:57
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\stack\q0225\MyStack.java
 */
package java.question.Stack.q0225;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    /** Initialize your data structure here. */
    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue1.add(x);

    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if (queue1.size() <= 0) {
            return -1;
        }
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }
        int value = queue1.poll();
        while (queue2.size() > 0) {
            queue1.add(queue2.poll());
        }
        return value;
    }

    /** Get the top element. */
    public int top() {
        if (queue1.size() <= 0) {
            return -1;
        }
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }
        int value = queue1.poll();
        while (queue2.size() > 0) {
            queue1.add(queue2.poll());
        }
        queue1.add(value);
        return value;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty();
    }
}