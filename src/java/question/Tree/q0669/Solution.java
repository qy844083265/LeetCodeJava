/*
 * @Author: your name
 * @Date: 2020-07-19 21:29:29
 * @LastEditTime: 2020-07-19 22:19:52
 * @LastEditors: your name
 * @Description: In User Settings Edit
 * @FilePath: \leetcodelearn\src\main\java\com\amd\leetcode\leetcodelearn\question\Tree\q0669\Solution.java
 */
package java.question.Tree.q0669;

import java.common.TreeNode;
import java.util.TreeMap;

/**
 * @author qinye 给定一个二叉搜索树，同时给定最小边界L 和最大边界 R。通过修剪二叉搜索树，使得所有节点的值在[L, R]中 (R>=L)
 * 。你可能需要改变树的根节点，所以结果应当返回修剪好的二叉搜索树的新的根节点。
 */
public class Solution {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) {
            return null;
        }
        if (root.val > R) {
            return trimBST(root.left, L, R);
        }
        if (root.val < L) {
            return trimBST(root.right, L, R);
        }
        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);
        return root;
    }

    public TreeNode trimBST2(TreeNode root, int L, int R) {
        if (root == null) {
            return null;
        }
        while (root.val < L || root.val > R) {
            if (root.val < L) {
                root = root.right;
            } else {
                root = root.left;
            }
        }
        TreeNode cur = root;
        while (cur != null) {
            while (cur.left != null && cur.left.val < L) {
                cur.left = cur.left.right;
            }
            cur = cur.left;
        }
        cur = root;
        while (cur != null) {
            while (cur.right != null && cur.right.val > R) {
                cur.right = cur.right.left;
            }
            cur = cur.right;
        }
        return root;
    }
}