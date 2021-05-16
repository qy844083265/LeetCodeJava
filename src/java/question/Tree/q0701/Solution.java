package java.question.Tree.q0701;

import java.common.TreeNode;

/**
 * 给定二叉搜索树（BST）的根节点和要插入树中的值，将值插入二叉搜索树。 返回插入后二叉搜索树的根节点。 输入数据 保证 ，新值和原始二叉搜索树中的任意节点值都不同。
 * <p>
 * 注意，可能存在多种有效的插入方式，只要树在插入后仍保持为二叉搜索树即可。 你可以返回 任意有效的结果
 */
public class Solution {
    public TreeNode parent = new TreeNode(0);

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        trans(root, val);
        return root;
    }

    public void trans(TreeNode cur, int val) {
        if (cur == null) {
            TreeNode node = new TreeNode(val);
            if (val > parent.val) {
                parent.right = node;
            } else {
                parent.left = node;
            }
            return;
        }
        parent = cur;
        if (cur.val > val) {
            trans(cur.left, val);
        }
        if (cur.val < val) {
            trans(cur.right, val);
        }
    }

    public TreeNode insertIntoBST2(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        TreeNode cur = root;
        TreeNode parent = root;
        while (cur != null) {
            parent = cur;
            if (val > cur.val) {
                cur = cur.right;
            } else {
                cur = cur.left;
            }
        }
        TreeNode node = new TreeNode(val);
        if (val > parent.val) {
            parent.right = node;
        } else {
            parent.left = node;
        }
        return root;
    }
}
