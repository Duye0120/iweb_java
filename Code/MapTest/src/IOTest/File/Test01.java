package IOTest.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class  Test01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("E:\\前端资料\\File\\zh.txt");
            int a;
                while ((a = fis.read())!= -1){
                    System.out.println(a);
                }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
