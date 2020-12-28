package com.th.leetcode.study.algorithms.routine.doublepointer;

/**
 * 双指针问题翻转字符串
 *
 * @author ：tengu
 * @date ：Created in 2020/12/22 5:14 下午
 */
public class RevertString344 {

    public static void main(String[] args) {

        char[] chars = {'h', 'e', 'l', 'l', 'o'};

        revertString(chars);

        System.out.println(String.valueOf(chars));

    }

    public static void revertString(char[] s) {
        int end = s.length - 1;
        int start = 0;

        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }
    }
}
