package HomeWork;

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
        this.students = new Student[10];
        // 初始化一些学生数据 ....
        this.students[0] = new Student(1001,"张三",96,"123456");
        this.students[1] = new Student(1002,"张三",80,"123456");
        this.students[2] = new Student(1003,"张三",78,"123456");
        this.students[3] = new Student(1004,"张三",100,"123456");
        this.students[4] = new Student(1005,"张三",67,"123456");
        this.size = 5;
        // 调用CodeUtil获取验证码： 并且打印到控制台

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

        // 2. 根据用户名找到学生： 找不到说明学生不存在

        // 3. 验证密码 ： 密码错误说明密码错误

        return false;
    }

    public void addStudent(Student student) {
        // TO DO

        // 1. 要确认数组的空间： 50%  << 1

        // 2. 如果空间够那么就 往 size 位置 添加学生信息
    }

    public void updateStudent(Student student) {
        // Student toUpdate = getStudentByNo(student.getStuNo());

        // 将 student 数据 set 到 toUpdate 对象中

    }

    private Student getStudentByNo(int no) {
        // TO DO
        // 从 students 数组中查找   for 循环 比较 no
        return null;
    }

    public void deleteStudentByNo(int studentNo) {
        // TO DO  for 循环 比较 no

        // 填补删除的位置
    }

    public void printStudentInfo() {
        // TO DO for 循环 调用 student.showInfo()
    }

    public void printScoreInfo() {
        // TO DO for 循环  调用 student.getScore()

    }

    public void sort(String code) {
        // TO DO :   int  a > b
    }

    public void close() {
        //  清空学生信息
        students = null;
        size = 0;
    }

}
