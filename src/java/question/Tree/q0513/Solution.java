package java.question.Tree.q0513;

import java.common.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 找树左下角的值
 * 
 * @author ribbonsalmark 用层序遍历比较好
 */
public class Solution {
	public int findBottomLeftValue(TreeNode root) {
		if (root == null) {
			return 0;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		int result = 0;
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.poll();
				if (i == 0) {
					result = node.val;
				}
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
			}
		}
		return result;
	}
}
