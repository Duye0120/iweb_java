package Exercise.HomeWork4;

import Exercise.HomeWork4.MyCompare.SinglePrice;
import Exercise.HomeWork4.MyCompare.TotalPrice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
/**
*@author shark
*@date 2021/5/4 14:54
*desc
*/
public class Test_ZH {
    public static void main(String[] args) {
        ArrayList<Product> contain = doSome.contain(new File("D:\\a.txt"));
        Collections.sort(contain,new SinglePrice());
//        按照单价打印
//        System.out.println(contain);
        doSome.OrderPrint(new File("D:\\price_order.txt"),contain);

//        按照总价打印
        Collections.sort(contain,new TotalPrice());
        doSome.MountPrint(new File("D:\\amount_order.txt"),contain);

//        输出到console
        FileReader fr = null;
        BufferedReader bf = null;
        int i = 0;
        try {
            fr = new FileReader("D:\\amount_order.txt");
            bf = new BufferedReader(fr);
            String s = "";
            bf.readLine();
            while ((s = bf.readLine()) != null){
                System.out.println((++i)+ "," + s.substring(3));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(bf != null){
                try {
                    bf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
