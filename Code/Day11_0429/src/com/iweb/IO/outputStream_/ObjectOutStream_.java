package com.iweb.IO.outputStream_;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 演示ObjectOutStream_
 */
public class ObjectOutStream_ {
    public static void main(String[] args) throws Exception {
        // 序列化后，保存的文件格式，不是存文本，而是按照他的格式来保存
        String filePath = "e:\\test.txt";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));

        // 序列化数据到e:\test.txt
        oos.write(100);// int -> Integer(实现了 Serializable)
        oos.writeBoolean(true);// boolean -> Boolean(实现了Serializable)
        oos.writeChar('a');
        oos.writeDouble(9.5);
        oos.writeUTF("杜也");

        // 保存一个dog对象
        oos.writeObject(new Dog("旺财",10));
    }
}

// 如果需要序列化某个类的对象，实现Serializable
class Dog implements Serializable {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
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
}
