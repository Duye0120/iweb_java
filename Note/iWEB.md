# iWEB笔记

# 数组

## 1. 数组的创建和声明

### 数组的创建和声明

数组：一种对象（引用数据类型）

> 特点：**固定长度** 存储多个**相同类型**的数组

数组的声明方式

1. 元素类型 变量名[]
2. 元素类型[] 变量名

创建数组空间：先声明再创建

数组名 = new 数组元素类型[数组的长度]；

`int arr = new int[10];`= `int[] arr; arr = new int[10];`

## 2. 数组的初始化和元素

有序，通过下标（索引）指定元素。从0开始。

> 每个数组都有一个属性length，表示该数组可以存放元素的个数。
>
> 自动检测是否越界

两种遍历方式

```java
// for 循环
for(;;){
    //TO DO
}
```

```java
// 增强for循环
for(int i : arr){
    //TO DO
}
```

#### 初始化

动态初始化（使用new关键字）

`int[] arr = new int[5]`

静态初始化（声明的同时进行初始化，同时指定元素，由系统获取长度）

`int[] arr = {1, 2, 3, 4, 5};`

## 3. 一维数组

## 4. 二维数组

# 面向对象：类、方法和属性

类与对象的概念；

对象：现实世界中每一个事务都是一个对象。

类：对象的抽象称之为类；分类、类型、模型

## 类与对象

设计类式，要考虑，对象是靠类的模型塑造出来的

> 对象本身已知的事物被称为：实例变量
>
> 对象可以执行的行为称为：方法

`类不是对象（类是创建对象的模型）`

类是对象的蓝图。会告诉虚拟机如何创建某种类型的的对象。

## 逃离main

**`main()`的两种用途：1. 测试真正的类，启动你的java应用程序**

### java拥有GC（垃圾回收机制）

>- 面向对象的设计拓展功能，不需要改动之前已经测试好的程序代码
>- 所以的java程序都定义在类中
>- 类如同蓝图描述该类型的对象要如何创建
>- 对象自治，你无需在意它如何完成任务
>- 对象有已知的事物，并能执行工作
>- 对象本身已知的事物成为实例变量，它代表对象的行为
>- 创建类时，可能会同时创建独立、测试用的类
>- 类可以继承抽象父类
>- java程序在执行期是一组会相互交谈的对象



### OOP的类

类：类实质上定义的是一种对象类型，它是对具有类似属性行为的对象的一种抽象

描述了属于该类型的对象的性质--统一的属性和操作方式

**属性**：描述对象的一组数据，表现为对象的一些变量。

方法：操作属性，操作代码：表示对象的行为或所作的工作

<font color=red>总结：类是创建对象的模板</font>

### 类的属性

类的属性：是指描述对象的一组数据，在代码中具体表现为**变量**

### 类的方法

总结：方法就是可以操作数据的对象通常表现方式为`方法名()`

**状态影响行为，行为影响状态**

方法会运用形参。调用的一方会传入实参（一个以上）。

也可以从方法中去的返回值。

`java`是通过值传递的，也就是所通过拷贝传递的。

> java并未规定一定要处理返回值，所以可以调用void类型的方法而不处理返回值

>- 类定义对象所知及所为
>- 方法可依据实例变量来展现不同的行为
>- 方法可以使用参数，你可以传入一个或者多个值给方法
>- 传给方法的参数必须符合声明时的数量、循序、和类型
>- 方法**必须**声明返回类型使用`void`类型代表方法不返回任何东西
>- 如果返回了非void的返回类型，就一定要返回与声明类型相同的值。

## 封装

封装的目的：保护数据

```java
// 实例代码
private int size;
public int getSize(){
    return this.size;
}
public void setSize(int s){
    this.size = s;
}
```

## 继承

> - 子类是extends父类出来的
> - 子类会继承父类所有的public类型的实例变量和方法，但不会继承private类型的变量和方法
> - 继承下来的方法可以被覆盖掉，但实例变量不能被覆盖掉
> - 当某个方法在子类中被覆盖过，则会调用覆盖过后的版本

# java常用类

> - ArrayList是javaAPI的类
> - 是用add（）来新增ArrayList的元素
> - 使用remove（）来删除元素
> - 寻找某项元素的位置，使用indexOf()
> - isEmpty() 判断是否为空。
> - size（） 可以获取ArrayList的大小
> - ArrayList会自动调整大小。
> - ArrayList<类型>
> - 类会用包来组织。
> - 类用于完整的名称，有包的名称和类的名称组成的。

## 面向对象基础：

1. ## 类:创建对象的模板

   1. 对象的抽象
   2. 实质上定义的是一种对象类型,是对具有相似属性行为的对象的一种抽象
   3. 描述了属于该类型的对象的性质--统一的属性和操作方式

2. ## 对象:对象是类的实例

3. ## 属性:

   1. 属性是指描述对象的一组数据,表现为对象的一些变量
   2. 描述对象的一组数据,代码中具体表现形式为变量

4. ## 方法:

   1. 作代码或方法表示对象的行为或所作的工作

5. ## 参数传递

6. ## 构造函数

   1. 构造函数的方法和类名相同
   2. 构造函数没有返回类型
   3. 构造函数的主要作用是完成对类对象的初始化工作
   4. 构造函数不能由编程人员显式地进行直接调用
   5. 在创建一个类的对象的同时,系统会自动调用该类的构造函数为新对象初始化

   ### 特点

   	1. 构造函数和类有相同的名字
   	2. 一个类可以有多个构造函数
   	3. 构造函数可以有0,1或多个参数
   	4. 构造函数没有返回值
   	5. 构造函数总是和new关键字一起被调用

   ### 作用

   	1. 对象初始化
   	2. 引入更多的灵活度
   	3. java中可以不定义构造函数

7. ## 构造函数重载

   1. 一个类中可以有多个构造函数,它们具有不同的参数列表(参数的类型,个数,顺序)

8. ## this关键字

   1. 与对象关联,表示当前对象(实例),即new出的是哪个对象,代表的就是哪个对象.

   ###  作用

   	1. 可以调用类的构造方法,普通方法,成员变量.
   	2. this调用构造方法只能是在构造方法中使用,必须是第一行.

9. ## 成员变量

   1. 又叫实例变量,方法外的变量叫做成员变量
   2. 有效范围是整个类

10. ## 局部变量

    1. 在方法中声明或定义的变量
    2. 在有效范围的方法体中,出了方法体就自动消失了.

11. ## 方法重载

    1. 方法重载是java中实现面向对象多态性机制的一种方式.
    2. 同一个类中有多个方法有**相同的名字**,**不同的参数列表**,和返回值无关,这种情况成为方法重载

## 面型对象设计

1. ### 封装： 定义、使用方式、set、get

   1. 其目的是将对象中的属性和方法组织起来,同时隐藏不想暴露的属性和方法及实现细节.
   2. 目的:将设计者与使用者分开.使用者不必知道实现的细节,只需要设计者提供方法来访问该对象

2. ### 继承：定义、特征、方法重写 VS 方法重载的区别、super

   1. 被继承的类被称为父类或超类或基类
   2. 继承父类的类被称为子类或派生类
   3. 继承执行的时候,子类将获得父类的所有成员,并具有自身特有的属性.

   ### extends关键字:用来继承类

   ​	一个类只能有一个父类,即单继承,但是可以通过间接继承,继承多个父类.子类继承父类的全部成员

   super关键字:是一个引用,用来在子类中访问父类中的构造函数,方法和实例变量

   `super()`必须是在子类构造函数的第一个执行语句

   ### 总结

   1. 子类继承父类,继承了父类所有的属性和方法,私有的不能只能访问
   2. 一个类如果没有extends,那么它将继承Object类,Object类式所有类的父类,始祖类
   3. 一个类可以继承多个类,但java中规定一个类只能直接继承一个类;可以间接继承
   4. 子类具有拓展功能,拓展子类特有的属性和方法
   5. 继承大大提高了代码的复用性

   ### Override(重写)

   子类的方法和父类具有:**相同的返回类型**,**相同的方法名**,**相同数量的类型的参数类别**,这种称为方法覆盖.

   可以通过`super`关键字调用直接父类中被覆盖的方法版本.

   ### 多态：编译多态和运行时多态


**编译时多态**:方法重载

**运行时多态**:方法重写

1. ### 抽象：抽象类、抽象方法、抽象类的特征

   ​	一种类型,只提供部分方法的具体实现

   ```java
   abstract class 类名{......}
   ```

   一般情况下,抽象类既包含具体方法,又包含抽象方法

   **具体方法**:既有方法的声明,又有方法的实现(既有方法体)

   **抽象方法**:只有方法的声明,而没有方法的实现.

   ```java
   语法:abstract 返回类型 方法名(参数列表)
   ```

   总结:三大前提条件

   1. 要有继承
   2. 要有方法的重写
   3. 父类引用指向子类对象

   **instanceof关键字**:判断一个类是否属于一个类型,必须要有继承的关系.

2. ### 设计模式： 设计模式的7大原则（4个就够了）、模板方法

3. ### 面向对象设计的目的： 解耦、代码复用、业务分离



# 集合

## JavaBean属性、属性、使用

<font color = red>JavaBean是一种JAVA语言组成的可重复用组件。</font>类必须是具体的和公共的，并且具有无参数的构造器。

JavaBean通过提供符合一致性设计模式的公共方法，将内部域暴露为属性。

### 特征

1. 无参的够咱函数
2. 私有的属性
3. 公共的get/set方法
4. 可序列化（实现Serializable接口）

### 序列化的要点

- 可以通过序列化类存储对象的状态
- 使用ObjectOutPutStream来序列化对象
- Stream是连接串流或是链接用的串流
- 读取对象的顺序必须和写入的程序相同
- 静态变量不会被序列化，因为所有的对象都是共享同一份静态变量值

### 属性

1. 简单属性：只接受单个值，比如说字符串或者一个数字

   ```java
   package JavaBeanTest;
   
   public class User {
      private String name;
      private int age;
      private String address;
   
       public User() {
       }
   
       public String getName() {
           return name;
       }
   
       public void setName(String name) {
           this.name = name;
       }
   
       public int getAge() {
           return age;
       }
   
       public void setAge(int age) {
           this.age = age;
       }
   
       public String getAddress() {
           return address;
       }
   
       public void setAddress(String address) {
           this.address = address;
       }
   }
   ```

>- JavaBean可以有多个构造函数，但其中必须有一个是无参的
>- 可以有多个main方法，作用是用来对JavaBean本身进行测试
>- 适应使用JavaBean将功能、业务处理、数据值、数据库访问和其它任何Java对象进行打包，以提供代码复用
>- 当把JavaBean应用到web环境中时，要保证它支持多线程环境--可将Bean中访问数据值的方法设为同步方法

![image-20210428193907775](iWEB.assets%5Cimage-20210428193907775.png)

## 集合的概念

集合是用于在类中对数据进行组织。集合是一种容器对象，用于按照一定的规则在其中保存一组对象。

J2SE中，引入了集合框架，它由集合库包构成（集合库包位于Java.util）中。定义了许多用于实现集合的接口和抽象类。

java2中，有一套设计优良的接口和类组成了java集合框架Collection

核心框架分为3种：`List`,`Set`,`Map`

### Collection接口

![4.集合的架构](iWEB.assets%5C4.%E9%9B%86%E5%90%88%E7%9A%84%E6%9E%B6%E6%9E%84.png)

**Collection**接口下的基本方法

`size()` `add(E e)` `remove(Object o)` `iterator()`

大小	添加	删除	迭代器

## List接口

常用各类有`ArrayList`,`LinkedList`,`Vector`和`Stack`

### ArrayList()

底层结构是数组 ：
 * 1. 容器的初始化容量是 10 , 如果容量不够的清空下 增长 50%
 * 2. 底层是数据, 增删比较慢, 查询比较快

### LinkedList()

底层是 双向链表 有序的可以有重复元素（List）

 * 1. 查询慢、增删快

### Vector()

底层是数组： 所有的方法都是同步的 线程安全的

### Stack()

## Set接口

### 2.1 HashSet

```java
package HashSetTest;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 底层是hashcode
 * 如何判定是重复元素
 * 1. 比价hashcode，如果不同则保存
 * 2. 如果hashcode相同则调用 equals方法
 */
public class Test {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        // 添加元素
        set.add("A");
        set.add(null);
        set.add("admin");
        set.add("jack");
        set.add("admin");
        set.add("123");

        // 大小
        int size = set.size();
        System.out.println(size);//5

        // set没有get(index)：不能查询指定的元素
        set.remove("A");// 通过值进行删除
        System.out.println(set.size());

        System.out.println("---------------");
        // 遍历：没办法使用fori 因为没有get
        // 增强for循环
        for (String e : set) {
            System.out.println(e);
        }

        System.out.println("--------------");
        // 迭代
        Iterator<String> its = set.iterator();
        while (its.hasNext()){
            System.out.println(its.next());
        }


    }
}
```

**hashset保存对象**

```java
package HashSetTest;

public class User {
    private Integer id;
    private String name;

    public User() {
    }

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 将次方法注释调用，让hashset调用Object的hashCode方法。
    // 则hashCode不同，不会调用equals
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ",name='" + name + '\''+
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("equals(Object obj)");
        return true;
    }
}
```

```java
package HashSetTest;

import java.util.HashSet;

public class HashSetUser {
    public static void main(String[] args) {
        HashSet<Object> users = new HashSet<>();
        users.add(new User(1,"admin"));
        users.add(new User(2,"jack"));

        System.out.println(users.size());
        // 简单的输出方式
        System.out.println(users.toString());
    }
}
```

### 2.2 TreeSet

元素唯一，底层是二叉树（自然有序）不能有null



## Map接口

特征：映射，数据存储是key-value型，key唯一

>1-> {"name:":"张三“,"age":20}
>
>2-> {"name:":"李四“,"age":20}

### HashMap

### TreeMap

### HashTable

代码看idea

## Collections

**colleaction和collections的区别：面试**

1. Collections是一个类，Collection是一个接口
2. Colleactions是提供了对Collection的操作，Collection是list和set的父类。

# IO流

流的定义：流指的是数据的流动、数据的传输。

文件系统类：File

流的分类

类的常用类：文件字节流，文件字符流，字符串缓冲流，字节数组流，对象流，打印流

### 1.1 File文件系统类

File这个类代表磁盘上的文件，但并不是文件中的内容。

可以对File对象做的事情

```java
//1. 创建出代表存盘文件的File对象
FIle f = new File(文件位置)
//2. 建立新的目录
File dir = new File();
dir.mkdir();
// 3. 列出目录下的内容
if	(dir.isDirectory()) {
}
// 4. 取得文件或目录的绝对路径
System.out.println(dir.getAbsolutePath());
// 5. 删除文件或目录(成功会返回true)
boolean isDeleted = f.delete();
```



#### 缓冲区的奥妙:没有缓冲区,一次只能拿一样东西.

### 1.2 IO流

>字节流（byte 音频 图片 视频）
>
>InputStream
>
>OutputStream
>
>字符流
>
>Write
>
>Read

>FIle 文件流（字符流（FileReader,FileWriter)、字节流（FileInputStream,FileOutPutStream))
>
>字节数组流:ByteArrayInputStream,ByteArrayOutputStream
>
>字符串缓冲流: BufferedReader,BufferedWriter
>
>对象流: ObjectInputStream,ObjectOutputStream
>
>转换流:InputStreamReader,OutPutStreamWriter
>
>打印流:printWriter

流的分类

### 节点流和处理流

>- 节点流和处理流的区别和联系
>  1. 节点流是底层流/低级流，直接跟数据源详解
>  2. 处理流包装节点流，即可以消除不同节点流实现差异，也可以提供更方便的方法来完成输入输出。
>  3. 处理流对节点流进行包装，使用了修饰器设计模式，不会直接与数据源相连。
>

#### 处理流-BufferedReader和BufferedWriter

属于字符流，是按照字符来读取数据

关闭时，只需要关闭外层流即可

#### 序列化和反序列化

序列化:保存数据是,保存数据的值和数据类型

反序列化:恢复数据时,恢复数据的值和数据类型

  

# 多线程

## 1.1 线程和进程

进程：正在运行的程序就是一个进程，单一的顺序控制流，有独立的代码运行空间

线程：轻量级的进程，单一的顺序控制流，有独立的代码 运行空间。

进程之间的通信开销比较大，线程之间的通信（进程内部的通信）开销比较小。

## 1.2 创建线程、多线程

### 1.2.1 创建线程

1. 实现Runnable接口，重写Run方法
2. 创建线程对象
3. 启动线程

### 1.2.2 创建多线程

```java
package com.iweb.Thread.lesson02;

import java.util.Date;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("子线程: " + Thread.currentThread().getName() + ": " + new Date());
    }
}
```

```java
package com.iweb.Thread.lesson02;

public class Test {
    public static void main(String[] args) {
        // 1. 创建线程
        MyRunnable myRunnable = new MyRunnable();
        // 2. 启动多线程
        Thread t1 = new Thread(myRunnable,"A");
        Thread t2 = new Thread(myRunnable,"B");
        Thread t3 = new Thread(myRunnable,"C");

        t1.start();
        t2.start();
        t3.start();
    }
}
```

使用Thread类来创建线程：编写方便，拓展性没有Runnable接口号。

```java
public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
```

```java
public class Test{
    public static void main(String[] args){
        Thread t = new MyThread();
        t.start();
    }
}
```

## 1.3 线程调度

sleep():休眠

yield():让步

join（）：线程的加入，一个线程强行加入另外一个线程，直到加入

## 1.4线程交互和守护线程&线程优先级

#### 1.4.1 线程优先级

```java
package com.iweb.Thread.lesson06_threadPriority;

public class Test {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable, "A");
        Thread t2 = new Thread(myRunnable, "B");
        Thread t3 = new Thread(myRunnable, "C");
        // 线程默认的优先级5
        // 通知jvm希望这个线程优先执行,但是不一定有限
        int priority = t1.getPriority();
        System.out.println(priority);
        
        t1.setPriority(1);
        t2.setPriority(10);
        t3.setPriority(10);
        t1.start();
        t2.start();
        t3.start();
    }
}
```

#### 1.4.2 守护线程

```Java
package com.iweb.Thread.lessonn07_threadProtected;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr, "守护线程");
        t.setDaemon(true); // 设定当前线程为守护线程
        
        t.start();
        Thread.sleep(3000);
        System.out.println("main over");
        
    }
}

```

```java
package com.iweb.Thread.lessonn07_threadProtected;

public class MyRunnable implements  Runnable{
    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

```

#### 1.4.3 线程组

1. 当一个线程被创建的时候默认的线程组是main线程组
2. 可以定义一个线程组,这个自定义的线程组默认是main线程组的子线程组
3. 可以指定一个线程的线程组.

1.5 线程的声明周期

## 1.5 数据共享

多线程执行的代码来自于同一个run方法,操作是同一个对象的数据

```java
package com.iweb.Thread.lesson08_threadShared;

public class Good {
    private Integer count = 2;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
    public void change() {
        if (count >= 1) {
            count--;
        }
    }
}

```

```java
package com.iweb.Thread.lesson08_threadShared;

public class GoodRunnable implements Runnable{
    private Good good;

    public GoodRunnable(Good good) {
        this.good = good;
    }

    @Override
    public void run() {
        good.change();
    }
}
```

```java
package com.iweb.Thread.lesson08_threadShared;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Good good = new Good();
        GoodRunnable gr = new GoodRunnable(good);
        Thread t1 = new Thread(gr);
        Thread t2 = new Thread(gr);
        Thread t3 = new Thread(gr);
        t1.start();
        t2.start();
        t3.start();
        Thread.sleep(100);
        System.out.println(good.getCount());
    }
}
```



## 1.6线程同步与线程锁

同步就是顺序执行,异步是相对于同步而言(多线程是实现异步的一种方案).



2.0 lock锁类

2.1 线程池

2.2 生产者消费者（设计模式）

2.3 定时任务