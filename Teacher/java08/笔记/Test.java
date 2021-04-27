public class Test {

    public static void main(String[] args) {

        Integer c = new Integer(100); // class
        Integer d = new Integer(100);
        System.out.println(c == d); // false
        Integer e = 200; // 不再 -128~127 new 
        Integer f = 200;
        System.out.println(e == f);  // false
        System.out.println(e == c); 

    }

}