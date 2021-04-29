package HomeWork;

import java.util.Arrays;

public class StudentAction {
    private Student[] students;
    private int size; // 是学生的数量,不是数组的长度
    private String code;// 验证码
    public  StudentAction() {
        this.students = new Student[5];
        // 初始化一些学生数据
        this.students[0] = new Student(1001, "张三", 96, "123456");
        this.students[1] = new Student(1002, "李四", 80, "123456");
        this.students[2] = new Student(1003, "王五", 78, "123456");
        this.students[3] = new Student(1004, "张六", 100, "123456");
        this.students[4] = new Student(1005, "李七", 67, "123456");
        this.size = 5;

        // 调用CodeUtil获取验证码,并且打印到控制台,告诉用户验证码
        CodeUtil codeUtil = new CodeUtil();
        String code = codeUtil.code();
        System.out.println("验证码:" + code);
    }
    public StudentAction(Student[] students) {
        this.students = students;
    }
    // 登录
    // 登录需要用户名,密码,验证码
    public boolean login(String userName,String password,String code){
        // 1. 验证验证码:匹配失败则说明输入错误
        if (!this.code.equals(code)){
            System.out.println("验证码匹配失败");
            return false;
        }

        // 2. 根据用户名找学生,  找不到说明学生不存在
        // 写一个查找学生的方法
        Student student = findStudentByName(userName);
        if (student == null){
            System.out.println("该学生不存在~");
            return false;
        }
        // 3. 验证密码,如果密码不匹配,则密码错误
        if (!password.equals(student.getPwd())){
            System.out.println("密码错误");
            return false;
        }
        System.out.println("登录成功");
        return true;
    }

    /**
     * 通过学生名字查找学生
     * @param username:输入的学生姓名
     * @return 如果匹配成功,则返回学生对象,如果匹配失败,则返回空对象.
     */
    private  Student findStudentByName(String username){
        for (int i = 0; i < size; i++) {
            Student student = this.students[i];
            if (student.getName().equals(username)){
                return student;
            }
        }
        return null;
    }

    // 添加学生
    public void addStudent(Student student){
        // 1. 要确定数组的空间: %50 << 1
        if (!validateCapacity()){
            grow();
        }
        // 2.如果空间足够,则将学生信息添加进去
        this.students[size++] = student;
    }

    /**
     * 增长数组
     */
    private void grow() {
        int newLen = this.students.length << 1;
        Student[] students = new Student[newLen];
        // 完成数据拷贝
        for (int i = 0; i < size; i++) {
            students[i] = this.students[i];
        }
        // 指向新的数组
        this.students = students;
    }
    /**
     * 确定容器的空间
     */
    public boolean validateCapacity() {
        return  size<this.students.length;
    }

    // 更新学生数据
    public void updateStudent(Student student){
        Student toUpdate = getStudentNo(student.getStuNo());
        if (toUpdate == null) {
            System.out.println("学生不存在");
            return;
        }
        // 将 student 数据 set 到 update对象中
        toUpdate.setScore(student.getScore());
        toUpdate.setPwd(student.getPwd());
    }
    //通过学号获取学生数组
    private Student getStudentNo(int no) {
        // 从students数组中查找 for循环 比较 no
        for (int i = 0; i < size; i++) {
            if (no == this.students[i].getStuNo()) {
                return this.students[i];
            }
        }
        return null;
    }

    public void deleteStudentByNo(int studentNo) {
        // 设学生不存在
        boolean flag = false;
        // 删除的学生的位置
        int position = 0;
        for (int i = 0; i < size; i++) {
            if (studentNo == this.students[i].getStuNo()) {
                this.students[i] = null;
                flag = true;
                position = i;
            }
        }
        if (flag){
            for (int i = 0; i < size-1; i++) {
                this.students[i] = this.students[i+1];
            }
            this.students[size-1] = null;
            size--;
        }
    }
    public void printStudentInfo() {
        // for 循环调用 student.showInfo()
        for (int i = 0; i < size; i++) {
            students[i].showInfo();
        }
    }

    public void printScoreInfo() {
        int maxScore = 0;
        int minScore = 0;
        int avgScore = 0;

        // 将分数存储到一个数组中
        int[] scores = new int[size];
        for (int i = 0; i < size; i++) {
            scores[i] = this.students[i].getScore();
        }

        Arrays.sort(scores);
        minScore  = scores[0];
        maxScore = scores[size - 1];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += scores[i];
        }
        avgScore = sum/size;
        System.out.println("最高分\t最低分\t平均分\t");
        System.out.printf("%s\t%s\t%s\t\n",maxScore,minScore,avgScore);
    }

    public void sort(String code) {
        Student temp = null;
        for (int i = size; i>0;i--){
            for (int j = 0;j<i-1;j++){
                if (this.students[j].compare(this.students[j+1]) >0){
                    temp = this.students[j+1];
                    this.students[j+1] = this.students[j];
                    this.students[j] = temp;
                }
            }
        }

        if (code.equals("desc")){
            Student[] students = new Student[this.students.length];
            int index = 0;
            for (int i = size -1;i>=0;i--){
                students[index++] = this.students[i];
            }
            this.students = students;
        }
    }

    public void close(){
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
