package HomeWork;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 16:14
 * 描述: Student
 */
public class Student {
    // ....

    private int stuNo;
    private String name;
    private int score;
    private String pwd;

    public Student() {
    }

    public Student(int stuNo, String name, int score, String pwd) {
        this.stuNo = stuNo;
        this.name = name;
        this.score = score;
        this.pwd = pwd;
    }

    public void showInfo() {
        // TO DO
        System.out.println(stuNo +"\t"+ name +"\t"+ score +"\t"+ pwd);
    }


    /**
     * 比较学生先后方法
     *
     * @param s
     * @return s<this: < 0 s = this:0 s>this:>0
     */
    public int compare(Student s) {
        // return s.score - this.score;
        return 0;
    }
}
