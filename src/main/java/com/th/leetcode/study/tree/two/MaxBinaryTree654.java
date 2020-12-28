package com.th.leetcode.study.tree.two;

import javax.swing.tree.TreeNode;
import java.util.TreeMap;

/**
 * @author ：tengu
 * @date ：Created in 2020/12/22 2:45 下午
 */
public class MaxBinaryTree654 {

    public static void main(String[] args) {

    }



    public TreeNode constructMaximumBinaryTree(int[] nums) {

        return build(nums, 0, nums.length - 1);

    }

    public TreeNode build(int[] nums, int left, int right) {

        if (left >= right) {
            return null;
        }

        Integer max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = left; i < right; i++) {
            int num = nums[i];
            if (num > max) {
                max = num;
                index = i;
            }
        }

        TreeNode root = new TreeNode(max);

        root.left = build(nums, left, index);

        root.right = build(nums, index + 1, right);

        return root;
    }



     static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


}
