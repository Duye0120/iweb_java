package IOTest.File;

import java.io.*;

public class  Test04 {
    public static void main(String[] args) {
       new Test04().copy();
    }
    public void copy(){
        FileInputStream fis = null;
        FileOutputStream fop = null;
        try {
            fis = new FileInputStream("E:\\前端资料\\File\\zh.txt");
            fop = new FileOutputStream("E:\\前端资料\\File\\zh1.txt");
            byte[] bytes = new byte[10];
            int a = 0;
            while ((a = fis.read(bytes)) != -1){
                fop.write(bytes,0,a);
                fop.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fop!=null){
                try {
                    fop.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
