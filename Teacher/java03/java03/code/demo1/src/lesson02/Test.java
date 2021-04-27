package lesson02;

/**
 * 作者: jack
 * 时间: 2021-04-16 0016 10:30
 * 描述: Test: 完成一个计算器
 */
public class Test {

    // 进行运算的 2 个数
    double a;
    double b;


    public double add() {
        return a + b;
    }

    public double minus() {
        return a - b;
    }

    public static void main(String[] args) {

        // 创建对象
        Test test = new Test();

        // 设定初始值: 需要相加的数
        // ? Scanner 接收
        test.a = 10.0D;
        test.b = 20.0D;
        // 进行运算 : double res  声明一个变量接收返回值
        double res = test.add();
        System.out.println(res);

        res = test.minus();
        System.out.println(res);
    }


}
