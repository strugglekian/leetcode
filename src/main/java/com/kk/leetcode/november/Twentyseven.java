package com.kk.leetcode.november;

import java.util.Arrays;

/**
 * @author kian
 * @date 2019/11/28
 * 原来这个叫双指针啊，我会啊
 */
public class Twentyseven {
    public static void main(String[] args) {

    }

    public int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
            }
            j++;
        }
        return j;
    }
}
