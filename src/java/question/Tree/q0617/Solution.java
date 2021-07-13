package java.question.Tree.q0617;

import java.common.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author qinye 给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。
 *         你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则不为 NULL
 *         的节点将直接作为新二叉树的节点。
 */
public class Solution {
	/**
	 * 递归
	 * 
	 * @param t1
	 * @param t2
	 * @return
	 */
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if (t1 == null) {
			return t2;
		}
		if (t2 == null) {
			return t1;
		}
		t1.val = t1.val + t2.val;
		mergeTrees(t1.left, t2.left);
		mergeTrees(t1.right, t2.right);
		return t1;
	}

	/**
	 * 迭代
	 */
	public TreeNode mergeTrees01(TreeNode t1, TreeNode t2) {
		if (t1 == null) {
			return t2;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(t1);
		queue.add(t2);
		while (!queue.isEmpty()) {
			TreeNode node1 = queue.poll();
			TreeNode node2 = queue.poll();
			node1.val += node2.val;
			if (node1.left != null && node2.left != null) {
				queue.add(node1.left);
				queue.add(node2.left);
			}
			if (node1.right != null && node2.right != null) {
				queue.add(node1.right);
				queue.add(node2.right);
			}
			if (node1.left == null && node2.left != null) {
				node1.left = node2.left;
			}
			if (node1.right == null && node2.right != null) {
				node1.right = node2.right;
			}
		}
		return t1;
	}
}