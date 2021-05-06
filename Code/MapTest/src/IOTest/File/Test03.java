package IOTest.File;

import java.io.*;

public class  Test03 {
    public static void main(String[] args) {
        FileOutputStream fis = null;
        try {
//            通过数组来保存
            byte[] bytes = {97,98,99,100,101};
//            没有文件会兴建，append： true 写入的文件不会覆盖原来的文件
            fis = new FileOutputStream("E:\\前端资料\\File\\zh.txt",true);
            fis.write(bytes);
            String str = "张欢";
            fis.write(str.getBytes());
            fis.flush();
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
