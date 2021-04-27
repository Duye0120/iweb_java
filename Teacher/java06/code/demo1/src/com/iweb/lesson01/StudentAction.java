package com.iweb.lesson01;

import java.util.Arrays;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 16:15
 * 描述: StudentAction
 */
public class StudentAction {

    private Student[] students;

    private int size; // 学生数： 不是数组的长度

    private String code; // 验证码

    public StudentAction() {
        this.students = new Student[5];
        // 初始化一些学生数据 ....
        this.students[0] = new Student(1001, "张三", 96, "123456");
        this.students[1] = new Student(1002, "李四", 80, "123456");
        this.students[2] = new Student(1003, "王五", 78, "123456");
        this.students[3] = new Student(1004, "张六", 100, "123456");
        this.students[4] = new Student(1005, "李七", 67, "123456");
        this.size = 5;

        // 调用CodeUtil获取验证码： 并且打印到控制台 告诉用户验证码
        CodeUtil codeUtil = new CodeUtil();
        code = codeUtil.code();
        System.out.println("[验证码]:" + code);

    }

    public StudentAction(Student[] students) {
        this.students = students;
    }

    /**
     * 通过控制台接收输入  Scanner
     *
     * @param username
     * @param password
     * @param code
     * @return
     */
    public boolean login(String username, String password, String code) {
        // TO DO
        // 1. 验证验证码 ： 匹配失败说明验证输入错误
        if (!this.code.equals(code)) {
            System.out.println("验证码错误~");
            return false;
        }
        // 2. 根据用户名找到学生： 找不到说明学生不存在
        Student student = findStudentByName(username);
        if (student == null) {
            System.out.println("学生不存在~");
            return false;
        }
        // 3. 验证密码 ： 密码错误说明密码错误
        if (!password.equals(student.getPwd())) {
            System.out.println("密码错误~");
            return false;
        }
        System.out.println("[登录成功]");
        return true;
    }

    private Student findStudentByName(String username) {
        for (int i = 0; i < size; i++) {
            Student student = this.students[i];
            if (student.getName().equals(username)) {
                return student;
            }
        }
        return null;
    }

    public void addStudent(Student student) {
        // 1. 要确认数组的空间： 50%  << 1
        if (!validateCapacity()) {
            grow();
        }
        // 2. 如果空间够那么就 往 size 位置 添加学生信息
        this.students[size++] = student;
    }

    /**
     * 确认容器的空间
     *
     * @return
     */
    public boolean validateCapacity() {
        return size < this.students.length;
    }

    /**
     * 增长数组
     */
    public void grow() {
        int newLen = this.students.length << 1;
        Student[] students = new Student[newLen];
        // 完成数据copy
        for (int i = 0; i < size; i++) {
            students[i] = this.students[i];
        }
        // 指向新的数组空间
        this.students = students;
        // System.out.println(this.students.length);
    }


    public void updateStudent(Student student) {
        Student toUpdate = getStudentByNo(student.getStuNo());
        if (toUpdate == null) {
            System.out.println("学生不存在");
            return;
        }
        // 将 student 数据 set 到 toUpdate 对象中
        toUpdate.setScore(student.getScore());
        toUpdate.setPwd(student.getPwd());
    }

    private Student getStudentByNo(int no) {
        // TO DO
        // 从 students 数组中查找   for 循环 比较 no
        for (int i = 0; i < size; i++) {
            if (no == this.students[i].getStuNo()) {
                return this.students[i];
            }
        }
        return null;
    }

    public void deleteStudentByNo(int studentNo) {
        // TO DO  for 循环 比较 no
        boolean flag = false; // 将设学生不存在
        int position = 0; // 删除的学生的为主
        for (int i = 0; i < size; i++) {
            if (studentNo == this.students[i].getStuNo()) {
                this.students[i] = null;
                flag = true;
                position = i;
            }
        }
        // 如果学生存在,填补删除的位置
        if (flag) {
            for (int i = position; i < size - 1; i++) {
                this.students[i] = this.students[i + 1];
            }
            this.students[size - 1] = null;
            size--;
        }
    }

    public void printStudentInfo() {
        // TO DO for 循环 调用 student.showInfo()
        for (int i = 0; i < size; i++) {
            students[i].showInfo();
        }
    }

    public void printScoreInfo() {
        // TO DO for 循环  调用 student.getScore()
        int maxScore = 0;
        int minScore = 0;
        int avgScore = 0;
        // 将分数存放到一个数组
        int[] scores = new int[size];
        for (int i = 0; i < size; i++) {
            scores[i] = this.students[i].getScore();
        }

        Arrays.sort(scores);
        // System.out.println(Arrays.toString(scores));
        minScore = scores[0];
        maxScore = scores[size - 1];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += scores[i];
        }
        avgScore = sum / size;
        System.out.println("最高分\t最低分\t平均分\t");
        System.out.printf("%s\t%s\t%s\t\n", maxScore, minScore, avgScore);
    }

    public void sort(String code) {
        // TO DO :   int  a > b

        Student temp = null;
        for (int i = size; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (this.students[j].compare(this.students[j + 1]) > 0) {
                    temp = this.students[j + 1];
                    this.students[j + 1] = this.students[j];
                    this.students[j] = temp;
                }
            }
        }
        if (code.equals("desc")) {
            Student[] students = new Student[this.students.length];
            int index = 0;
            for (int i = size - 1; i >= 0; i--) {
                students[index++] = this.students[i];
            }
            this.students = students;
        }
    }

    public void close() {
        //  清空学生信息
        students = null;
        size = 0;
    }

    public Student[] getStudents() {
        return students;
    }

    public int getSize() {
        return size;
    }
}
