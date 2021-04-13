package java.question.DP.q0337;

import java.common.TreeNode;

/**
 * 
 * @author ribbonsalmark
 *         在上次打劫完一条街道之后和一圈房屋后，小偷又发现了一个新的可行窃的地区。这个地区只有一个入口，我们称之为“根”。
 *         除了“根”之外，每栋房子有且只有一个“父“房子与之相连。一番侦察之后，聪明的小偷意识到“这个地方的所有房屋的排列类似于一棵二叉树”。
 *         如果两个直接相连的房子在同一天晚上被打劫，房屋将自动报警。
 * 
 */
public class Solution {
	public int rob(TreeNode root) {
		int[] result = robTree(root);
		return Math.max(result[0], result[1]);
	}

	public int[] robTree(TreeNode root) {
		if (root == null) {
			return new int[] { 0, 0 };
		}
		int[] left = robTree(root.left);
		int[] right = robTree(root.right);
		//
		int val1 = root.val + left[0] + right[0];
		int val2 = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
		return new int[] {val2,val1};
				
	}
}
