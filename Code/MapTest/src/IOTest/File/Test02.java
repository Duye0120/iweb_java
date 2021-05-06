package IOTest.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class  Test02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
//            通过数组来保存
            byte[] bytes = new byte[2];
            fis = new FileInputStream("E:\\前端资料\\File\\zh.txt");
            InputStreamReader reader = new InputStreamReader(fis);
            int a = 0;
                while ((a = fis.read(bytes))!=-1){
                    System.out.println(new String(bytes,0,a));

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
