package HomeWork;

/**
 * 作者: jack
 * 时间: 2021-04-21 0021 16:14
 * 描述: Student
 */
public class Student {
    // ....
    private int StuNo;
    private String name;
    private int score;
    private String pwd;

    public Student() {
    }

    public int getStuNo() {
        return StuNo;
    }

    public void setStuNo(int stuNo) {
        StuNo = stuNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Student(int stuNo, String name, int score, String pwd) {
        StuNo = stuNo;
        this.name = name;
        this.score = score;
        this.pwd = pwd;
    }

    public void showInfo(Student[] student) {
        // TO DO
        System.out.printf("%s\t\t%s\t\t%s\n",getStuNo(),this.name,this.score);

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
