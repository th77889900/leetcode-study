package com.th.leetcode.study.arraystudy;

import sun.security.util.AuthResources_ko;

/**
 * 旋转数组
 *
 * @author ：tengu
 * @date ：Created in 2020/12/22 10:36 下午
 */
public class RotateArray189 {

    public static void main(String[] args) {

//        int[] ints = {-1, -100, 3, 99};
        int[] ints = {1, 2, 3, 4, 5, 6};
        //  1 2 3 4 5 6
        //  1 2 1 4 5 6
        //  1 2 1 4 3 6
        //  5 2 1 4 3 6
        //  5 2 1 2 3 6
        //  5 2 1 2 3 4
        //  5 6 1 2 3 4
        rotate2(ints, 3);
        System.out.println();
    }

    public static void rotate(int[] nums, int k) {

        int count = 0;
        int length = nums.length;
        while (count < k) {
            count++;
            int temp = nums[length - 1];
            for (int i = length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
                if (i == 1) {
                    nums[i - 1] = temp;
                }
            }
        }
    }

    public static void rotate2(int[] nums, int k) {

        int length = nums.length;

        int temp = nums[0];

        int current = 0;
        int count = 0;
        for (int i = current; i < length; i++) {

            if (k % 2 == 0) {
                if (current == 0) {
                    count++;
                }

                if (count > 1 && current == 0) {
                    current = current + 1;
                    temp = nums[current];
                }

            }

            current = (current + k) % length;

            int middle = nums[current];

            nums[current] = temp;

            temp = middle;

        }
    }

}
