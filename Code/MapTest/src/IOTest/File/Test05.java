package IOTest.File;

import java.io.*;

public class Test05 {
    public static void main(String[] args) {

        try {
//            节点流
            FileReader  fr = new FileReader(new File("E:\\前端资料\\File\\zh.txt"));

           BufferedReader bfr =new BufferedReader(fr);
            String a ="";
            while ((a = bfr.readLine())!=null){
                System.out.println(a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


     }
}
