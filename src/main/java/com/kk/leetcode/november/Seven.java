package com.kk.leetcode.november;

/**
 * @author kian
 * @date 2019/11/5
 */
public class Seven {
    public static void main(String[] args) {
        System.out.println(reverse(1234567899));

    }

    /**
     * 应该不是出题的本意，不过也算计算出来了。。明天继续努力
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
