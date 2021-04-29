package HomeWork;


import java.util.Random;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 16:21
 * 描述: CodeUtil
 */
public class CodeUtil {


    // 生成随机验证码 [A-Za-z0-9]  4位
    public String code() {

        char[] cs = new char[62];
        addElement(cs, 0, 26, 'A');
        addElement(cs, 26, 26, 'a');
        addElement(cs, 52, 10, '0');
        shuffle(cs);
        return getCode(cs);
    }

    /**
     * @param cs
     * @param offset
     * @param len
     * @param c
     */
    private void addElement(char[] cs, int offset, int len, char c) {
        for (int i = 0; i < len; i++) {
            cs[offset] = (char) (c + i);
        }
    }

    //取4个
    private String getCode(char[] cs) {
        return " " + cs[0] + cs[1] + cs[2] + cs[3];
    }

    // 洗牌
    private void shuffle(char[] cs) {

        int len = cs.length;
        int position = 0;// 交换的位置
        char temp;
        Random random = new Random();
        while(len > 0) {
            position = random.nextInt(len--);
            // 交换
            temp = cs[position];
            cs[position] = cs[len];
            cs[len] = temp;
        }
    }
}
