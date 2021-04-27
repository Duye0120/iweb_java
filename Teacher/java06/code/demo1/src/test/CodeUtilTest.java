package test;

import com.iweb.lesson01.CodeUtil;
import com.iweb.lesson01.Student;
import com.iweb.lesson01.StudentAction;
import org.junit.Test;


/**
 * 作者: jack
 * 时间: 2021-04-22 0022 09:32
 * 描述: CodeUtilTest
 */
public class CodeUtilTest {


    @Test
    public void testCode() {
        CodeUtil codeUtil = new CodeUtil();
        String code = codeUtil.code();
        System.out.println(code);
    }


    @Test
    public void shuffleTest() {
//        CodeUtil codeUtil = new CodeUtil();
//        char[] cs = {'A', 'C', 'D', 'E'};
//        codeUtil.shuffle(cs);
//        System.out.println(Arrays.toString(cs));
    }


    @Test
    public void addStudentTest() {
        Student student = new Student(1006, "ABC", 100, "123");
        StudentAction action = new StudentAction();
        action.addStudent(student);
        action.printStudentInfo();
    }


    @Test
    public void updateStudentTest() {
        Student student = new Student(1005, null, 100, "123");
        StudentAction action = new StudentAction();
        action.updateStudent(student);
        action.printStudentInfo();
    }

    @Test
    public void deleteStudentByNoTest() {
        StudentAction action = new StudentAction();
        action.deleteStudentByNo(1001);
        action.printStudentInfo();
    }


    @Test
    public void printScoreInfoTest() {
        StudentAction action = new StudentAction();
        action.printScoreInfo();
    }

    @Test
    public void sortTest() {
        StudentAction action = new StudentAction();
        action.printStudentInfo();
        action.sort("desc");
        System.out.println("--------------------");
        action.printStudentInfo();
    }
}
