package java.question.Tree.q0113;

import java.common.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author ribbonsalmark 给你二叉树的根节点 root 和一个整数目标和 targetSum ，找出所有 从根节点到叶子节点
 *         路径总和等于给定目标和的路径。
 */
public class Solution {
	List<List<Integer>> reslut = new ArrayList<>();;
	List<Integer> path = new ArrayList<>();

	public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
		if (root == null) {
			return reslut;
		}
		path.add(root.val);
		traversal(root, targetSum - root.val);
		return reslut;
	}

	public void traversal(TreeNode root, int targetSum) {
    	if (root.left == null && root.right == null && targetSum == 0) {
			reslut.add(new ArrayList<>(path));
			return;
		}
		if (root.left == null && root.right == null) {
			return;
		}
    	if (root.left != null) {
			path.add(root.left.val);
    		targetSum -= root.left.val;
			traversal(root.left, targetSum);
			targetSum += root.left.val;
			path.remove(path.size()-1);
		}
    	if (root.right != null) {
			path.add(root.right.val);
    		targetSum -= root.right.val;
			traversal(root.right, targetSum);
			targetSum += root.right.val;
			path.remove(path.size()-1);
		}
    	return;
	}
}
