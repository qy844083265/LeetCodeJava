/*
 * @Author: your name
 * @Date: 2020-07-04 11:40:00
 * @LastEditTime: 2020-07-04 14:50:46
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\stack\q1130\Solution.java
 */
package java.question.Stack.q1130;

import java.common.ListNode;
import java.util.Stack;

public class Solution {
    public int mctFromLeafValues(int[] arr) {
        return 0;
    }

    public static ListNode addTwoNumbers(ListNode l) {
        ListNode head = l;
        Stack<ListNode> stack = new Stack<>();
        while (l != null) {
            stack.push(l);
            l = l.next;
        }
        int index = 1;
        int flag = 0;
        while (!stack.isEmpty()) {
            ListNode node = stack.pop();
            int value = node.val + index + flag;
            if (value < 10) {
                node.val = value;
                index = 0;
                flag = 0;
            } else {
                node.val = value - 10;
                index = 0;
                flag = 1;
            }
        }
        if (flag == 0) {
            return head;
        } else {
            ListNode newHead = new ListNode(flag);
            newHead.next = head;
            return newHead;
        }

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(9);
        l1.next = l2;
        l2.next = l3;
        l3.next = null;
        ListNode result = addTwoNumbers(l1);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

}