package FileExercise;

import java.io.File;

public class Text1 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\admin\\Desktop\\java笔记\\四月二十八号\\zhanghuan.txt");
        System.out.println(file.exists());//是否存在
        System.out.println(file.isFile());//是否为文件
        System.out.println(file.length());
        File dir = new File("C:\\Users\\admin\\Desktop\\java笔记\\四月二十八号");

        //list()指的是文件名
        for (int i = 0; i < dir.list().length; i++) {
            System.out.println(dir.list()[i]);
        }
//        listFiles()是文件这个对象
        File[] files = dir.listFiles();
        System.out.println(files.length);
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i].getName());
        }

    }
}
