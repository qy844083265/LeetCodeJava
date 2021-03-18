package java.question.LinkList.q0876;

import java.common.ListNode;

/**
 * 给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
 * 
 * 如果有两个中间结点，则返回第二个中间结点。
 * 
 * @author qinye
 *
 */
public class Solution {
	public ListNode middleNode(ListNode head) {
		ListNode fastNode = head;
		ListNode slowNode = head;
		while (fastNode != null && fastNode.next != null) {
			fastNode = fastNode.next;
			fastNode = fastNode.next;
			slowNode = slowNode.next;
		}
		return slowNode;
	}
}