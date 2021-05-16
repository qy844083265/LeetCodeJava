package java.question.Tree.q0112;

import java.common.TreeNode;

/**
 * 
 * @author ribbonsalmark
 *给你二叉树的根节点 root 和一个表示目标和的整数 targetSum ，判断该树中是否存在 根节点到叶子节点 的路径，这条路径上所有节点值相加等于目标和 targetSum 。
 */
public class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
    	if (root == null) {
			return false;
		}
    	return traversal(root, targetSum-root.val);
    }
    public boolean traversal(TreeNode root, int targetSum) {
    	if (root.left == null && root.right == null && targetSum == 0) {
			return true;
		}
    	if (root.left == null && root.right == null) {
			return false;
		}
    	if (root.left != null) {
			targetSum -= root.left.val;
			if (traversal(root.left, targetSum)) {
				return true;
			}
			targetSum += root.left.val;
		}
    	if (root.right != null) {
			targetSum -= root.right.val;
			if (traversal(root.right, targetSum)) {
				return true;
			}
			targetSum += root.right.val;
		}
    	return false;
    }
}
