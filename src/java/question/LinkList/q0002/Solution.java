package java.question.LinkList.q0002;

import java.common.ListNode;

/**
 * 
 * @author qinye 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位
 *         数字。
 * 
 *         如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 
 *         您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 */
public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode p = l1;
		ListNode q = l2;
		ListNode preNode = new ListNode(-1);
		ListNode curNode = preNode;
		int ex = 0;
		while (p != null || q != null) {
			int x = p == null ? 0 : p.val;
			int y = q == null ? 0 : q.val;
			int sum = x + y + ex;
			if (sum >= 10) {
				curNode.next = new ListNode(sum - 10);
				ex = 1;
			} else {
				ex = 0;
				curNode.next = new ListNode(sum);
			}
			if (p != null) {
				p = p.next;
			}
			if (q != null) {
				q = q.next;
			}
			curNode = curNode.next;
		}
		if (ex > 0) {
			curNode.next = new ListNode(ex);
		}
		return preNode.next;
	}
}
