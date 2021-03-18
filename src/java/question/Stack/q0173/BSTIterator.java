/*
 * @Author: your name
 * @Date: 2020-07-02 22:54:20
 * @LastEditTime: 2020-07-04 10:30:59
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\stack\q0173\BSTIterator.java
 */
package java.question.Stack.q0173;

import java.common.TreeNode;
import java.util.Stack;

/**
 * 
 * @author qinye 实现一个二叉搜索树迭代器。你将使用二叉搜索树的根节点初始化迭代器。
 * 
 *         调用 next() 将返回二叉搜索树中的下一个最小的数。
 */
public class BSTIterator {
	Stack<TreeNode> stack = new Stack<>();

	public BSTIterator(TreeNode root) {
		middle(root);
	}

	/** @return the next smallest number */
	public int next() {
		if (hasNext()) {
			TreeNode node = stack.pop();
			middle(node.right);
			return node.val;
		}
		return -1;
	}

	/** @return whether we have a next smallest number */
	public boolean hasNext() {
		return !stack.isEmpty();

	}

	public void middle(TreeNode node) {
		while (node != null) {
			stack.push(node);
			node = node.left;
		}
	}
}