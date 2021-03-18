package java.question.Tree.q0104;

import java.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author qinye 给定一个二叉树，找出其最大深度。
 * 
 *         二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * 
 *         说明: 叶子节点是指没有子节点的节点。
 */
public class Solution {
	/**
	 * 递归分治解决
	 *
	 * @param root
	 * @return
	 */
	public int maxDepth(TreeNode root) {
		return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
	}

	/**
	 * 非递归，广度优先
	 *
	 * @param root
	 * @return
	 */
	public int maxDepthNoRecurse(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int height = 0;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.poll();
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
			}
			height++;
		}
		return height;
	}
}
