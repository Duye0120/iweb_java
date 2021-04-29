package HomeWork;


import org.junit.Test;

import java.util.Random;

/**
 * 生成随机验证码[A-Za-z0-9] 4位
 */
public class CodeUtil {

    /**
     * 生成随机数
     * @return 返回验证码
     */
    public String code() {
        // 生成一个62个字符的数组(26+26+10)
        char[] cs = new char[62];
        // 需要一个方法,将数字和字母添加到数组中
        // 所以创建方法addElement();
        //[A-Z]
        addElement(cs,0,26,'A');
        //[a-z]
        addElement(cs,26,26,'a');
        //0-9
        addElement(cs,52,10,'0');
        shuffle(cs);
        return getCode(cs);
    }

    /**
     * 将数字和字母添加到数组中
     * @param cs:待加的数组
     * @param offset:起始偏移量(我最开始要移动的位置)
     * @param len:我要移动的长度
     * @param c: 起始字符
     */
    private void addElement(char[] cs,int offset,int len,char c){
        for (int i = 0; i < len; i++) {
            cs[offset] = (char)(c + i);
        }
    }
    // 洗牌 数组打乱
    private void shuffle(char[] cs) {
        int len = cs.length;
        int position = 0;// 交换的位置
        char temp;// 定义一个空数组
        Random random = new Random();// 定义一个随机数
        while (len > 0) {
            position = random.nextInt();
            temp = cs[position];
            cs[position] = cs[len];
            cs[len] = temp;
        }
        System.out.println(1111);
    }
    private  String getCode(char[] cs){
        return "" + cs[0] + cs[1] + cs[2] + cs[3];
    }
}
