package java.question.Tree.q0530;

import java.common.TreeNode;
import java.util.Stack;

/**
 * 给你一棵所有节点为非负值的二叉搜索树，请你计算树中任意两节点的差的绝对值的最小值。
 * @author ribbonsalmark
 *
 */
public class Solution {
	public int result = Integer.MAX_VALUE;
	TreeNode preNode;
    public int getMinimumDifference(TreeNode root) {
    	if (root == null) {
			return 0;
		}
    	traversal(root);
    	return result;
    }
    public void traversal(TreeNode node) {
    	if (node == null) {
			return;
		}
    	traversal(node.left);
    	if (preNode != null) {
			result = Math.min(result, node.val - preNode.val);
		}
    	preNode = node;
    	traversal(node.right);
    }
    
    public int getMinimumDifference2(TreeNode root) {
    	if (root == null) {
			return 0;
		}
    	TreeNode cur = root;
    	TreeNode pre = null;
    	Stack<TreeNode> stack = new Stack<>();
    	Integer max = Integer.MAX_VALUE;
    	while (cur != null || !stack.isEmpty()) {
			if (cur != null) {
				stack.push(cur);
				cur = cur.left;
			}else {
				TreeNode node = stack.pop();
				if (pre != null) {
					max = Math.min(max, node.val-pre.val);
				}
				pre = cur;
				node = node.right;
			}
		}
    	return max;
    }
}
