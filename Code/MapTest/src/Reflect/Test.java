package Reflect;

public class Test {


    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class c1 = Class.forName("Reflect.User");
        Object o = c1.newInstance();
//        System.out.println((User)o.name);

    }
}
