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
        String str = "";
        char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
                'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Random random = new Random();
        for (int i = 0; i <4; i++){
            char num = ch[random.nextInt(ch.length)];
            str += num;
        }
        return str;
    }

}
