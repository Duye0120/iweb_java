package lesson03;

/**
 * 作者: jack
 * 时间: 2021-04-16 0016 10:48
 * 描述: Student
 */
public class Student {

    String name;

    public void choose(Teacher teacher) {
        // TO DO:完成业务
        System.out.printf("%s选择了%s的%s\n", name, teacher.name, teacher.course);
    }

}
