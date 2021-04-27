package lesson01;

/**
 * 作者: jack
 * 时间: 2021-04-16 0016 09:03
 * 描述: Student
 * <p>
 * 1. 类 : 对象的抽象,创建对象的模板
 * 2. 对象: 万物皆对象,类的实例
 * 3. 属性: 对象的特征
 * 4. 方法: 操作、对象的行为
 * 5. 类和对象的关系： 类是创建对象的模板
 * 6. 调用属性： 目的是保存数据,使用数据  方式(对象名.属性名)
 * 7. 调用方法: 做事情, 完成业务. 方式(  对象名.方法名(参数列表)  )
 * 8. 创建对象： new 关键字
 * 9. 成员变量的默认值为 对应数据类型的 缺省值
 */
public class Student {

    // 属性 ： 成员变量(实例变量)
    String name = "王五"; // 指定默认的初始值
    char sex;
    int age;

    /**
     * public：方法的访问修饰符,public 表示任意的作用范围都可以方法
     * void： 方法执行的返回值类型 void 表示没有返回值
     * study：方法名
     * (String course): 形参, 调用这个方法必须传递的参数
     */
    public void study(String course) {
        // 方法体 ： 具体的方法实现
        System.out.println(name + "学习" + course);
    }

    public static void main(String[] args) {
        // 创建对象
        Student student = new Student(); // 申请了堆内存空间(根据属性的类型) ： 所有的类都是引用数据类型
        // 属性 初始化
        student.name = "张三";
        student.sex = '男';
        student.age = 20;

        // 调用方法
        student.study("oracle"); // "java" 实参 = 实际的参数


        Student student1 = new Student(); // 申请空间
        student1.name = "李四";
        student1.sex = '女';
        student1.age = 18;

        student1.study("java");

        Student student2 = new Student();

        student2.study("java");
        System.out.println(student2.age);

    }

}
