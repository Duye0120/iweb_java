package lesson02;

public class Test {
    public static void main(String[] args) {
        Phone phone = new Phone("华为",8);
        // 查看手机型号
        System.out.println(phone.getModel());
        System.out.println(phone.getMemory());
    }
}
