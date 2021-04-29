package Demo01;

public class Test01 {
    public static void show(String str) {
        System.out.println(str);

    }

    public static void show(Object obj) {
        System.out.println(obj);
    }
    public static void main(String[] args) {
        show(null);
    }
}
