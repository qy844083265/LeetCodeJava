package java.question.Tree.q0979;

import java.common.TreeNode;

/**
 * 
 * @author qinye 给定一个有 N 个结点的二叉树的根结点 root，树中的每个结点上都对应有 node.val 枚硬币，并且总共有 N 枚硬币。
 * 
 *         在一次移动中，我们可以选择两个相邻的结点，然后将一枚硬币从其中一个结点移动到另一个结点。(移动可以是从父结点到子结点，或者从子结点移动到父结点。)。
 * 
 *         返回使每个结点上只有一枚硬币所需的移动次数。
 */

public class Solution {
	int res;

	public int distributeCoins(TreeNode root) {
		res = 0;
		dfs(root);
		return res;
	}

	public int dfs(TreeNode node) {
		if (node == null) {
			return 0;
		}
		int L = dfs(node.left);
		int R = dfs(node.right);
		res += Math.abs(L) + Math.abs(R);
		return node.val + L + R - 1;
	}
}
