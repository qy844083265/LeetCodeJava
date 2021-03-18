package java.question.LinkList.q0083;

import java.common.ListNode;

/**
 * 
 * @author qinye 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 */

public class Solution {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode curNode = head;
		ListNode afNode = head.next;
		while (curNode != null && afNode != null) {
			if (curNode.val == afNode.val) {
				curNode.next = curNode.next.next;
				afNode = curNode.next;
			}else {
				curNode = curNode.next;
				afNode = afNode.next;
			}
		}
		return head;
	}
}
