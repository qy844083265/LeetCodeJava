package java.question.Tree.q0098;

import java.common.TreeNode;
import java.util.Stack;

/**
 * 
 * @author ribbonsalmark
 *
 */
public class Solution {
	TreeNode preNode = null;
    public boolean isValidBST(TreeNode root) {
    	if (root == null) {
			return true;
		}
    	boolean isleft = isValidBST(root.left);
    	if (preNode != null && preNode.val >= root.val) {
			return false;
		}
    	preNode = root;
    	boolean isRight = isValidBST(root.right);
    	return isleft && isRight;
    }
    
    public boolean isValidBST2(TreeNode root) {
    	if (root == null) {
			return true;
		}
    	Stack<TreeNode> stack = new Stack<>();
    	TreeNode cuNode = root;
    	TreeNode preNode = null;
    	while (cuNode != null || !stack.isEmpty()) {
			if (cuNode != null) {
				stack.push(cuNode);
				cuNode = cuNode.left;
			}else {
				cuNode = stack.pop();
				if (preNode != null && preNode.val >= cuNode.val) {
					return false;
				}
				preNode = cuNode;
				cuNode = cuNode.right;
			}
		}
    	return true;
    }
}
