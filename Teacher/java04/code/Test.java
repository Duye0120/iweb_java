public class Test {


    public void show(String str) {
        System.out.println("str");
    }

    public void show(int[] arr) {
        System.out.println("arr");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.show(null);
    }

}