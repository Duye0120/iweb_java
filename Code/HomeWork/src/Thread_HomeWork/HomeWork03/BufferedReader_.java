package Thread_HomeWork.HomeWork03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class BufferedReader_ {

    public static void main(String[] args) throws Exception {
        String filePath = "d:\\a.txt";
        // 创建bufferedReader
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        // 读取
        String line; // 按行读取,效率高
        int count = 1;
        // 说明
        // 1. readLine() 按行读取文件
        // 2. 当返回null时,表示文件读取完毕
        while((line = bufferedReader.readLine())!= null){
            List<Product> list = readLine(line);
            System.out.println(list.toString());
            //System.out.println(line);
        }
        // 关闭流,这里注意:只需要关闭BufferedReader,因为底层会自动的去关闭节点流
        // FileReader
        bufferedReader.close();
    }
    public static List<Product> readLine(String line){
        String[] split = line.split(",");
        Product product = new Product(Integer.parseInt(split[0]), split[1], Float.parseFloat(split[2]), Integer.parseInt(split[3]));
        List<Product> list = new ArrayList<>();
        list.add(product);
        //System.out.println(list.toString());
        return list;
    }


}
