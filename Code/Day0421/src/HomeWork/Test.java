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
        Scanner sc = new Scanner(System.in);

        System.out.println();

//        System.out.println("请输入用户名");
//        String username = sc.next();
//        System.out.println("请输入密码");
//        String password = sc.next();
//        System.out.println("请输入验证码");
//        String code = sc.next();
//
//        boolean flag = action.login(username, password, code);
//
//        if (!flag) {
//            return;
//        }

        // 输入学生信息...


            Student student = new Student();
            System.out.println("请输入学生学号");
            int stuNo = sc.nextInt();
            student.setStuNo(stuNo);
            System.out.println("请输入学生姓名");
            String name = sc.next();
            student.setName(name);
            System.out.println("请输入学生分数");
            int score = sc.nextInt();
            student.setScore(score);
            System.out.println("请输入学生密码");
            String pwd = sc.next();
            student.setPwd(pwd);
            action.addStudent(student);


        // 创建学生对象: set


        // 打印学生信息
        action.printStudentInfo();

        // ....
    }

}
