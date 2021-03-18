/*
 * @Author: your name
 * @Date: 2020-07-16 23:30:19
 * @LastEditTime: 2020-07-19 13:51:07
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\Tree\q0617\Solution.java
 */
package java.question.Tree.q0617;

import java.common.TreeNode;
import java.util.Stack;

/**
 * 
 * @author qinye 给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。
 *         你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则不为 NULL
 *         的节点将直接作为新二叉树的节点。
 */
public class Solution {
	/**
	 * 递归
	 * 
	 * @param t1
	 * @param t2
	 * @return
	 */
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if (t1 == null) {
			return t2;
		}
		if (t2 == null) {
			return t1;
		}
		t1.val = t1.val + t2.val;
		mergeTrees(t1.left, t2.left);
		mergeTrees(t1.right, t2.right);
		return t1;
	}

	/**
	 * 迭代
	 */
	public TreeNode mergeTrees01(TreeNode t1, TreeNode t2) {
		if (t1 == null) {
			return t2;
		}
		Stack<TreeNode[]> stack = new Stack<>();
		stack.push(new TreeNode[] { t1, t2 });
		while (!stack.isEmpty()) {
			TreeNode[] n = stack.pop();
			if (n[0] == null || n[1] == null) {
				continue;
			}
			n[0].val += n[1].val;
			if (n[0].left == null) {
				n[0].left = n[1].left;
			} else {
				stack.push(new TreeNode[] { n[0].left, n[1].right });
			}
			if (n[0].right == null) {
				n[0].right = n[1].right;
			} else {
				stack.push(new TreeNode[] { n[0].right, n[1].right });
			}
		}
		return t1;
	}
}