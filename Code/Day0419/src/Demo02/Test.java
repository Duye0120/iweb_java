package Demo02;

public class Test {
     int a = 100;
     public void show(int num) {
         System.out.println(a);
         int b = 200;
         {
             int c = 300;
         }
         System.out.println(b);
//         System.out.println(c);
         int a = 400;
         System.out.println(a);
         System.out.println(num);
     }

    public static void main(String[] args) {
        Test test = new Test();
        test.show(1000);
    }
}
