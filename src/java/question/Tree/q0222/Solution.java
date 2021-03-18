/*
 * @Author: your name
 * @Date: 2020-07-22 22:16:30
 * @LastEditTime: 2020-07-22 22:17:44
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\Tree\q0222\Solution.java
 */
package java.question.Tree.q0222;

import java.common.TreeNode;

/**
 * 
 * @author qinye 给出一个完全二叉树，求出该树的节点个数。
 * 
 *         说明：
 * 
 *         完全二叉树的定义如下：在完全二叉树中，除了最底层节点可能没填满外，其余每层节点数都达到最大值，并且最下面一层的节点都集中在该层最左边的若干位置。若最底层为第
 *         h 层，则该层包含 1~ 2h 个节点。
 * 
 */
public class Solution {
	public int countNodes(TreeNode root) {
		return root != null ? 1 + countNodes(root.left) + countNodes(root.right) : 0;
	}
}