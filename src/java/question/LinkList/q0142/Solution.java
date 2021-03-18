package java.question.LinkList.q0142;

import java.common.ListNode;

/**
 * 
 * @author qinye 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 * 
 *         为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是
 *         -1，则在该链表中没有环。
 */
public class Solution {
	public ListNode detectCycle(ListNode head) {
		boolean flag = false;
		if (head == null || head.next == null || head.next.next == null) {
			return null;
		}
		ListNode fast = head;
		ListNode slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next;
			fast = fast.next;
			slow = slow.next;
			if (fast == slow) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			return null;
		}
		fast = head;
		while (fast != slow) {
			fast = fast.next;
			slow = slow.next;
		}
		return fast;
	}
}
