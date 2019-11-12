package com.kk.leetcode.november;

/**
 * @author kian
 * @date 2019/11/12
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例 1:
 * <p>
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * <p>
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 * <p>
 * 所有输入只包含小写字母 a-z 。
 */
public class Fourteen {
    public static void main(String[] args) {
//        System.out.println(longestCommonPrefix(new String[]{"a"}));
        System.out.println("ss".indexOf("ss"));
    }


    /**
     * 方法二,两两比较，所有的数组循环一次
     */
    public static String lcp2(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String s = strs[0];
        for (int i = 0; i < strs.length; i++) {
            while (0 != strs[i].indexOf(s)) {
                s = s.substring(0, s.length() - 1);
                if (s.isEmpty()) {
                    return "";
                }
            }

        }
        return s;

    }


    /**
     * 方法一有点low，但是还算是做出来了
     * 执行用时 : * 3 ms * ,
     * 在所有 java 提交中击败了 * 39.47% * 的用户
     * 内存消耗 : * 37.5 MB
     * , 在所有 java 提交中击败了 * 77.04% * 的用户
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String s = strs[0];
        int count = 0;
        String result = "";
        for (int j = 0; j < s.length(); j++) {
            for (String str : strs) {
                boolean b = str.startsWith(s.substring(0, j + 1));
                if (b) {
                    count++;
                }
            }
            if (strs.length == count) {
                result = s.substring(0, j + 1);
                count = 0;
            } else {
                break;
            }
        }
        return result;
    }
}
