package IOTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyFileInputStream {
//    从硬盘到内存
public static void main(String[] args) {
    FileInputStream fileInputStream = null;
    try {
         fileInputStream = new FileInputStream("C:\\Users\\admin\\Desktop\\java笔记\\文件归类\\ni\\java.html");
         int readData = 0;
         while((readData = fileInputStream.read())!= -1){
             System.out.println((char) readData);
         }
        System.out.println(fileInputStream.read());
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        if(fileInputStream!=null){
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
}
