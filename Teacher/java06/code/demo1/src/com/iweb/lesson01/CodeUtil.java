package com.iweb.lesson01;

import java.util.Random;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 16:21
 * 描述: CodeUtil
 */

public class CodeUtil {

    // 生成随机验证码 [A-Za-z0-9]  4位
    public String code() {
        // 生成以 [A-Za-z0-9] 的数组
        char[] cs = new char[62];
        // [A-z]
        addElement(cs, 0, 26, 'A');
        // System.out.println(Arrays.toString(cs));
        // [a-z]
        addElement(cs, 26, 26, 'a');
        // System.out.println(Arrays.toString(cs));
        // [0-9]
        addElement(cs, 52, 10, '0');
        // System.out.println(Arrays.toString(cs));
        shuffle(cs); // 洗牌
        return getCode(cs); // 去前面4个字符为验证码
    }

    /**
     * @param cs     : 待加的数组
     * @param offset : 起始偏移量
     * @param len    : 添加的个数
     * @param c      : 起始字符
     */
    private void addElement(char[] cs, int offset, int len, char c) {
        for (int i = 0; i < len; i++) {
            cs[offset + i] = (char) (c + i);
        }
    }


    private String getCode(char[] cs) {
        return "" + cs[0] + cs[1] + cs[2] + cs[3];
    }

    //洗牌： 数组打乱
    private void shuffle(char[] cs) {
        int len = cs.length;
        int position;// 交换的位置
        char temp;
        Random random = new Random();
        while (len > 0) {
            position = random.nextInt(len--); // 0-9
            // 交换
            temp = cs[position];
            cs[position] = cs[len];
            cs[len] = temp;
        }
    }


}
