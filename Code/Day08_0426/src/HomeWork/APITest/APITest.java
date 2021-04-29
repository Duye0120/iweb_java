package HomeWork.APITest;

import java.util.Scanner;

/**
 * The Apache Tomcat software is developed in an open
 * and participatory environment and released under the
 * Apache License version 2. The Apache Tomcat project is
 * intended to be a collaboration of the best-of-breed developers
 * from around the world. We invite you to participate in this open
 * development project. To learn more about getting involved, click here.
 *
 * 找出上面文本中出现次数最多的 单词 不区分大小写
 */
public class APITest {

    public static void main(String[] args) {
        // 输入文字
        String str = "The Apache Tomcat software is developed in an open and participatory environment and released under the Apache License version 2. The Apache Tomcat project is intended to be a collaboration of the best-of-breed developers from around the world. We invite you to participate in this open development project. To learn more about getting involved, click here.";
        // 将文字格式化,将其中,.转换为空格,同时存放在Strings数组中
        String[] strings = str.toLowerCase().replace(',',' ').replace('.',' ').split("\\s+");
        // 获取strings数组的长度
        int len = strings.length;
        // 创建一个新的数组,长度与数组的长度相同
        int[] count = new int[len];
        // 创建一个新的数组,用来存储新的字符
        String[] mostWords = new String[len];

        for (int i = 0; i < strings.length; i++) {
            // trim去掉两端多余的空格
            // 将Strings去掉两端多余的空格并存储在新的数组中
            String word = strings[i].trim();
            int f = onList(word,strings);
            // 如果不相等,则将这个值放在i这个位置,并计数为1
            if (f == -1){
                mostWords[i] = word;
                count[i] = 1;
            }else{
                // 如果相等,则将这个值放在f的位置,如果还有相同的,则加1
                mostWords[f] = word;
                count[f] += 1;
            }
        }
        int index = mostFrequent(count);
        System.out.printf("出现次数最多的单词是%s,出现次数为%s",mostWords[index],count[index]);
    }


    /**
     * 返回出现次数最多的数字的下标
     * @param list 数组
     * @return 返回最多数字出现的下标
     *
     */
    public static int mostFrequent(int[] list){
        int max = 0;
        int index = 0;
        for (int i = 0; i < list.length; i++) {
            // 如果list的值大于max,将max赋值为list[i],index赋值为i
            if (max < list[i]){
                max = list[i];
                index = i;
            }
        }
        return index;
    }

    /**
     *如果list的值和word的值相同,则返回list的下标i
     * @param word 数组,存储Strings[i]去掉两端空格的数
     * @param list 存放格式化后的文字
     * @return 返回当前文字所在的位置
     *          相等返回i
     *          不相等返回-1
     */
    public static int onList(String word,String[] list){
        for (int i = 0; i < list.length; i++) {
            if (word.equals(list[i])){
                return i;
            }
        }
        return -1;
    }
}
