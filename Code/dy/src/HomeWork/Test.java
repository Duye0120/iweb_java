package HomeWork;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        StudentAction action = new StudentAction();

        // 接收输入参数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String username = scanner.next();
        System.out.println("请输入密码：");
        String password = scanner.next();
        System.out.println("请输入验证码：");
        String code = scanner.next();

        boolean flag = action.login(username, password, code);

        if (!flag) {
            return;
        }


        // 输入学生信息...
        System.out.println("[新增学生]");
        System.out.println("输入stuNo:");
        int stuNo = Integer.parseInt(scanner.next());
        System.out.println("输入name:");
        String name = scanner.next();
        System.out.println("输入score:");
        int score = scanner.nextInt();
        System.out.println("输入pwd:");
        String pwd = scanner.next();

        // 创建学生对象: set
        Student student = new Student();
        student.setStuNo(stuNo);
        student.setName(name);
        student.setScore(score);
        student.setPwd(pwd);

        action.addStudent(student);

        // 打印学生信息
        action.printStudentInfo();

        // 修改学生
        System.out.println("[修该学生]");
        System.out.println("输入stuNo:");
        stuNo = Integer.parseInt(scanner.next());
        System.out.println("输入score:");
        score = scanner.nextInt();
        System.out.println("输入pwd:");
        pwd = scanner.next();

        student = new Student();
        student.setStuNo(stuNo);
        student.setScore(score);
        student.setPwd(pwd);

        action.updateStudent(student);
        System.out.println("--------------------");
        action.printStudentInfo();

        System.out.println("[删除学生]");

        System.out.println("输入stuNo:");
        stuNo = Integer.parseInt(scanner.next());
        action.deleteStudentByNo(stuNo);

        System.out.println("--------------------");
        action.printStudentInfo();

        System.out.println("--------------------");
        action.printScoreInfo();

    }
}
