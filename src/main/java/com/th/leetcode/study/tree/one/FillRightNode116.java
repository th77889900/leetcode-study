package com.th.leetcode.study.tree.one;

/**
 * leetcode 116 题
 * 给定一个 完美二叉树 ，其所有叶子节点都在同一层，每个父节点都有两个子节点.
 * @author ：tengu
 * @date ：Created in 2020/12/21 2:05 下午
 */
public class FillRightNode116 {


    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

        dfs(root);

        return root;
    }

    public Node connect2(Node root) {
        if (root == null) {
            return null;
        }

        Node pre = root;

        while (pre.left != null) {

            Node temp = pre;
            while (temp != null) {
                temp.left.next = temp.right;
                if (temp.next != null) {
                    temp.right.next = temp.next.left;
                }

            }
            temp = temp.next;

        }

        pre = pre.left;

        return root;
    }

    private void dfs(Node root) {
        if (root == null) {
            return;
        }

        Node left = root.left;
        Node right = root.right;

        while (left != null) {
            left.next = right;
            left = left.right;
            right = right.left;
        }

        dfs(root.left);
        dfs(root.right);

    }

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
}
