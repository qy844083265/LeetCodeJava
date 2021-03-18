package java.question.LinkList.q0019;

import java.common.ListNode;

/**
 * 
 * @author qinye 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 */
public class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		int count = n;
		ListNode fast = head;
		ListNode curNode = head;
		while (count > 0 && fast != null) {
			fast = fast.next;
			count--;
		}
		if (fast == null) {
			return head.next;
		}
		ListNode slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
		return curNode;
	}
}
