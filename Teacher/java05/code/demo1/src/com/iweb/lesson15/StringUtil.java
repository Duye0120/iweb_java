package com.iweb.lesson15;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 14:12
 * 描述: StringUtil
 */
public class StringUtil {

    private String str;

    public StringUtil(String str) {
        this.str = str;
    }

    // 新的功能
    public char[] toChars() {
        String[] strs = str.split("");
        char[] cs = new char[strs.length];
        for (int i = 0; i < strs.length; i++) {
            cs[i] = strs[i].charAt(0);
        }
        return cs;
    }

    public boolean equals(String word) {
        return str.equals(word);
    }

}
