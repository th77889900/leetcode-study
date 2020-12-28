package com.th.leetcode.study.tree.one;

//翻转一棵二叉树。
//
// 示例：
//
// 输入：
//
//      4
//   /   \
//  2     7
// / \   / \
//1   3 6   9
//
// 输出：
//
//      4
//   /   \
//  7     2
// / \   / \
//9   6 3   1
//
// 备注:
//这个问题是受到 Max Howell 的 原问题 启发的 ：
//
// 谷歌：我们90％的工程师使用您编写的软件(Homebrew)，但是您却无法在面试时在白板上写出翻转二叉树这道题，这太糟糕了。
// Related Topics 树
// 👍 714 👎 0

/**
 * @author ：tengu
 * @date ：Created in 2020/12/21 11:42 上午
 */
public class FlipBinaryTree226 {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(4);
        node.left = new TreeNode(2);
        node.right = new TreeNode(7);

        node.left.left = new TreeNode(1);
        node.left.right = new TreeNode(3);
        node.right.left = new TreeNode(6);
        node.right.right = new TreeNode(9);

        TreeNode treeNode = invertTree(node);

        traverse(node);

    }

    public static TreeNode invertTree(TreeNode node) {
        if (node == null) {
            return null;
        }

        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        invertTree(node.left);
        invertTree(node.right);

        return node;
    }

    public static void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        traverse(root.left);
        System.out.println(root.val);
        traverse(root.right);

    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
