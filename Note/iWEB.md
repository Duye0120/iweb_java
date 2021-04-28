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

# 集合

## JavaBean属性、属性、使用

<font color = red>JavaBean是一种JAVA语言组成的可重复用组件。</font>类必须是具体的和公共的，并且具有无参数的构造器。

JavaBean通过提供符合一致性设计模式的公共方法，将内部域暴露为属性。

### 特征

1. 无参的够咱函数
2. 私有的属性
3. 公共的get/set方法
4. 可序列化（实现Serializable接口）

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

![image-20210428193907775](F:%5CA_iweb%5Ciweb_java%5CNote%5CiWEB.assets%5Cimage-20210428193907775.png)

## 集合的概念

集合是用于在类中对数据进行组织。集合是一种容器对象，用于按照一定的规则在其中保存一组对象。

J2SE中，引入了集合框架，它由集合库包构成（集合库包位于Java.util）中。定义了许多用于实现集合的接口和抽象类。

java2中，有一套设计优良的接口和类组成了java集合框架Collection

核心框架分为3种：`List`,`Set`,`Map`

### Collection接口

![4.集合的架构](F:%5CA_iweb%5Ciweb_java%5CNote%5CiWEB.assets%5C4.%E9%9B%86%E5%90%88%E7%9A%84%E6%9E%B6%E6%9E%84.png)

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