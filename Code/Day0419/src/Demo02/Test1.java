package Demo02;

public class Test1 {
    public void change(int a) {
        System.out.println("before:" + a);
        a = 20;
        System.out.println("after:" + a);
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        int a = 10;
        test1.change(a);
        System.out.println(a);
    }
}
