/*
 * @Author: your name
 * @Date: 2020-07-16 22:58:29
 * @LastEditTime: 2020-07-16 23:29:47
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edi
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\Tree\q0096\Solution.java
 */
package java.question.Tree.q0096;

/**
 * 
 * @author qinye 给定一个整数 n，求以 1 ... n 为节点组成的二叉搜索树有多少种？
 */
public class Solution {
	public int numTrees(int n) {
		int c = 1;
		for (int i = 0; i < n; i++) {
			c = c * 2 * (2 * i + 1) / (i + 2);
		}
		return c;
	}
}