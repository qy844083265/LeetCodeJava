package java.question.Tree.q0404;

import java.common.TreeNode;
import java.util.Stack;

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
	
	public int sumOfLeftLeaves2(TreeNode root) {
		if(root == null) {
			return 0;
		}
		Stack<TreeNode> stack = new Stack<>();
		int result = 0;
		stack.push(root);
		while(!stack.isEmpty()) {
			TreeNode node = stack.pop();
			if(node.left != null && node.left.left == null && node.left.right == null) {
				result += node.left.val;
			}
			if(node.right != null) {
				stack.push(node.right);
			}
			if(node.left != null) {
				stack.push(node.left);
			}
		}
		return result;
    }
}
