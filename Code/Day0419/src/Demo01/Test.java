package Demo01;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.age = 18;
        student.name = "jack";
        student.show();
        Student s1 = new Student("jack", 18);
        s1.show();
        new Student();
    }
}
