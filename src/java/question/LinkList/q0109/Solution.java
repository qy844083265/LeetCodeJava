package java.question.LinkList.q0109;

import java.common.ListNode;
import java.common.TreeNode;

/**
 * 
 * @author qinye 给定一个单链表，其中的元素按升序排序，将其转换为高度平衡的二叉搜索树。
 * 
 *         本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 */
public class Solution {
	public TreeNode sortedListToBST(ListNode head) {
		return buildNode(head, null);
	}

	public TreeNode buildNode(ListNode left, ListNode right) {
		if (left == right) {
			return null;
		}
		ListNode middle = getMiddle(left, right);
		TreeNode node = new TreeNode(middle.val);
		node.left = buildNode(left, middle);
		node.right = buildNode(middle.next, right);
		return node;
	}

	public ListNode getMiddle(ListNode left, ListNode right) {
		ListNode fast = left;
		ListNode slow = left;
		while (fast != right && fast.next != right) {
			fast = fast.next;
			fast = fast.next;
			slow = slow.next;
		}
		return slow;
	}
}
