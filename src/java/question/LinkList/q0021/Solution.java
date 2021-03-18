package java.question.LinkList.q0021;

import java.common.ListNode;

/**
 * @author qinye 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode preNode = new ListNode(-1);
		ListNode curNode = preNode;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				curNode.next = l1;
				l1 = l1.next;
			} else {
				curNode.next = l2;
				l2 = l2.next;
			}
			curNode = curNode.next;
		}
		curNode.next = l1 == null ? l2 : l1;
		return preNode.next;
	}

	public ListNode mergeTwoListsRecurse(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		} else if (l2 == null) {
			return l1;
		} else if (l1.val <= l2.val) {
			l1.next = mergeTwoListsRecurse(l1.next, l2);
			return l1;
		} else {
			l2.next = mergeTwoListsRecurse(l1, l2.next);
			return l2;
		}
	}

}
