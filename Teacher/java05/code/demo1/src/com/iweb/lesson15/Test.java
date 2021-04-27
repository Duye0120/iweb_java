package com.iweb.lesson15;

import java.util.Arrays;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 14:11
 * 描述: Test
 */
public class Test {

    public static void main(String[] args) {

        StringUtil stringUtil = new StringUtil("abc");

        // 新功能使用
        char[] chars = stringUtil.toChars();
        System.out.println(Arrays.toString(chars));

        System.out.println(stringUtil.equals("abcd"));

    }

}
