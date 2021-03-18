package java.question.LinkList.q0092;

import java.common.ListNode;

/**
 * 
 * @author qinye 反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
 * 
 *         说明: 1 ≤ m ≤ n ≤ 链表长度。
 */
public class Solution {
	public ListNode reverseBetween(ListNode head, int m, int n) {
		int length = n - m;
		ListNode preNode = new ListNode(-2);
		preNode.next = head;
		ListNode beforeNode = preNode;
		while (m > 1) {
			beforeNode = beforeNode.next;
			head = head.next;
			m--;
		}
		while (length > 0) {
			ListNode node = head.next;
			head.next = node.next;
			node.next = beforeNode.next;
			beforeNode.next = node;
			length--;
		}
		return preNode.next;
	}
}
