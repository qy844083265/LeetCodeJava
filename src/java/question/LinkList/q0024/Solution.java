package java.question.LinkList.q0024;

import java.common.ListNode;

/**
 * 
 * @author qinye 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * 
 *         你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 */
public class Solution {
	/**
	 * 迭代
	 */
	public ListNode swapPairs(ListNode head) {
		ListNode preNode = new ListNode(-1);
		preNode.next = head;
		ListNode curNode = preNode;
		while (head != null && head.next != null) {
			ListNode first = head;
			ListNode second = head.next;
			curNode.next = second;
			first.next = second.next;
			second.next = first;
			curNode = first;
			head = first.next;
		}
		return preNode.next;
	}
	/**
	 * 递归
	 */
	public ListNode swapPairs1(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode firstNode = head;
		ListNode secondNode = head.next;
		firstNode.next = swapPairs1(secondNode.next);
		secondNode.next= firstNode;
		return secondNode;
	}
}
