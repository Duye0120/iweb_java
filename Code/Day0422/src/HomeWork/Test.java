package HomeWork;

import java.util.Scanner;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 16:14
 * 描述: Test
 */
public class Test {

    public static void main(String[] args) {

        StudentAction action = new StudentAction();

        // 接收输入参数
        Scanner scanner = new Scanner(System.in);

        String username = scanner.next();
        String password = scanner.next();
        String code = scanner.next();

        boolean flag = action.login(username, password, code);

        if (!flag) {
            return;
        }

        // 输入学生信息...

        // 创建学生对象: set
        Student student = new Student();

        action.addStudent(student);

        // 打印学生信息
        action.printStudentInfo();

        // ....
    }

}
