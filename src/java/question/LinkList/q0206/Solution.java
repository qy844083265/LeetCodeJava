package java.question.LinkList.q0206;

import java.common.ListNode;

/**
 * 
 * @author qinye 反转一个单链表。
 */
public class Solution {
	public ListNode reverseList(ListNode head) {
		ListNode pre = null;
		ListNode cur = head;
		while (cur != null) {
			ListNode temp = cur.next;
			cur.next = pre;
			pre = cur;
			cur = temp;
		}
		return pre;
	}
}
