package com.kk.leetcode.november;

/**
 * @author kian
 * @date 2019/11/5
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 *
 */
public class Seven {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE%10);
        System.out.println(Integer.MIN_VALUE%10);
    }

    public static int reverse2(int x) {
        int result = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (Integer.MAX_VALUE / 10 < result || (Integer.MAX_VALUE / 10 == result && Integer.MAX_VALUE % 10 < x)) {
                return 0;
            }
            if (Integer.MIN_VALUE / 10 > result || (Integer.MIN_VALUE / 10 == result && Integer.MIN_VALUE % 10 > x)) {
                return 0;
            }
            result = result * 10 + pop;
        }
        return result;

    }

    /**
     * 应该不是出题的本意，不过也算计算出来了。。明天继续努力
     *
     * @param x
     * @return
     */
    public static int reverse(int x) {
        String s = x + "";
        StringBuffer stringBuffer = new StringBuffer(s);
        StringBuffer reverse = stringBuffer.reverse();
        String s1 = reverse.toString();
        String substring = null;
        String result = null;
        if (s1.endsWith("-")) {
            substring = s1.substring(0, s1.length() - 2);
            result = "-" + substring;
        } else {
            result = s1;
        }

        int s2;
        try {
            s2 = Integer.parseInt(result);
        } catch (NumberFormatException e) {
            return 0;
        }
        return s2;
    }


}
