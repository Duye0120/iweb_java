package HomeWork;

public class Student {
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

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
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

    public void showInfo() {
        System.out.println(stuNo + "\t" + name + "\t" + score + "\t" + pwd);
    }

    /**
     * 比较学生先后的方法
     * @param s
     * @return
     */
    public int compare(Student s) {
        return this.score - s.score;
    }
}
