package java.question.Tree.q0404;

import java.common.TreeNode;

/**
 * 计算给定二叉树的所有左叶子之和。
 * @author ribbonsalmark
 *
 */
public class Solution {
	/**
	 * 后序遍历
	 * @param root
	 * @return
	 */
	public int sumOfLeftLeaves(TreeNode root) {
		if(root == null) {
			return 0;
		}
		int left = sumOfLeftLeaves(root.left);
		int right = sumOfLeftLeaves(root.right);
		int mid = 0;
		if (root.left != null && root.left.left == null && root.left.right == null) {
			mid = root.left.val;
		}
		return mid + left + right;
    }
}
