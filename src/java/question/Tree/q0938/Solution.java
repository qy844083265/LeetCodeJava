package java.question.Tree.q0938;

import java.common.TreeNode;

/**
 * 给定二叉搜索树的根结点 root，返回 L 和 R（含）之间的所有结点的值的和。
 * 
 * 二叉搜索树保证具有唯一的值。
 * 
 * @author qinye
 *
 */
public class Solution {
	int result = 0;

	public int rangeSumBST(TreeNode root, int L, int R) {
		dfs(root, L, R);
		return result;
	}

	public void dfs(TreeNode root, int L, int R) {
		if (root != null) {
			if (root.val >= L && root.val <= R) {
				result += root.val;
			}
			if (L < root.val) {
				dfs(root.left, L, R);
			}
			if (R > root.val) {
				dfs(root.right, L, R);
			}
		}
	}
}
