package lesson04;

import java.util.Random;

/**
 * 作者: jack
 * 时间: 2021-04-16 0016 11:51
 * 描述: Utils
 */
public class Utils {

    /**
     * 根据上限和下限获取一个区间
     *
     * @param values [10,100]
     * @return 50
     */
    public double getValue(double[] values) {
        // TO DO
        Random random = new Random();
        double val = random.nextDouble();

        // 10,100
        double min = values[0];
        double max = values[1];
        double res = val * (max - min + 1) + min;
        return Math.floor(res);
    }

    /**
     * 判断技能是否释放
     *
     * @param x : 技能触发的概率
     * @return
     */
    public boolean isDo(double x) {
        // 生成数组
        int[] arr = new int[10];
        int len = (int) (x * 10);
        for (int i = 0; i < len; i++) {
            arr[i] = 1;
        }
        Random random = new Random();
        int index = random.nextInt(10);
        return arr[index] == 1;
    }

}
