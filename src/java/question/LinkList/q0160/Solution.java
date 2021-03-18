package java.question.LinkList.q0160;

import java.common.ListNode;

/**
 * 
 * @author qinye 编写一个程序，找到两个单链表相交的起始节点。
 */
public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode pre1 = headA;
		ListNode pre2 = headB;
		int count1 = 0;
		int count2 = 0;
		while (pre1 != null) {
			pre1 = pre1.next;
			count1++;
		}
		while (pre2 != null) {
			pre2 = pre2.next;
			count2++;
		}
		int dif = Math.abs(count1 - count2);
		if (count1 > count2) {
			while (dif > 0) {
				headA = headA.next;
				dif--;
			}
		}
		if (count1 < count2) {
			while (dif > 0) {
				headB = headB.next;
				dif--;
			}
		}
		while (headA != null && headB != null) {
			if (headA == headB) {
				return headA;
			}
			headA = headA.next;
			headB = headB.next;
		}
		return null;
	}
}
