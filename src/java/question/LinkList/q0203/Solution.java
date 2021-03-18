package java.question.LinkList.q0203;

import java.common.ListNode;

/**
 * 
 * @author qinye 删除链表中等于给定值 val 的所有节点
 */
public class Solution {
	public ListNode removeElements(ListNode head, int val) {
		ListNode preNode = new ListNode(-1);
		preNode.next = head;
		ListNode curNode = preNode;
		while (curNode.next != null) {
			if (curNode.next.val == val) {
				curNode.next = curNode.next.next;
			} else {
				curNode = curNode.next;
			}
		}
		return preNode.next;
	}
}
