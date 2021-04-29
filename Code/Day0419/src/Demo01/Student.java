package Demo01;

public class Student {
    String name;
    int age;

    public Student() {
        // 默认的构造函数,无参
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println(name + " " + age);
    }
}
