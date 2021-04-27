package lesson03;

/**
 * 作者: jack
 * 时间: 2021-04-16 0016 10:36
 * 描述: Test: 测试类
 * <p>
 * 设计一个程序完成选课： 某某学生 选择 某某老师的什么课程
 * 1. 张三选择了李老师的java课程
 * 2. 李四选择了王老师的oracle课程
 * <p>
 * 面向对象分析：OOA  -> 目的 分类 属性 方法
 * UML模型图
 * 类：Student Teacher
 * 属性：Student(name)   Teacher(name,course)
 * 方法：Student(choose(Teacher teacher))   Teacher
 * 面向对象设计：OOD
 * 向对象程序设计：OOP 编程 (涉及到语言 java c++)
 */
public class Test {

    public static void main(String[] args) {

        // 初始化老师实例
        Teacher t1 = new Teacher();
        t1.name = "李老师";
        t1.course = "java";

        Teacher t2 = new Teacher();
        t2.name = "王老师";
        t2.course = "oracle";

        // 初始化学生实例

        Student s1 = new Student();
        s1.name = "张三";

        Student s2 = new Student();
        s2.name = "李四";

        // 开始选课
        s1.choose(t1); // 方法执行的过程中使用的数据就是来源于 t1 这个实例
        s2.choose(t2);
        s1.choose(t2);

    }

}
