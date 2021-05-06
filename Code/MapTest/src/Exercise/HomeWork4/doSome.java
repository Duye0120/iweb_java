package Exercise.HomeWork4;

import java.io.*;
import java.util.ArrayList;

public class doSome {
    private static ArrayList<Product> list= new ArrayList<>();
    private static String pro;
//    静态方法一 用来保存商品信息
    public static ArrayList<Product> contain(File file){
        BufferedReader br = null;
        FileReader fr = null;
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
//            第一行不是商品属性 先读一行
            pro = br.readLine();
            String s = null;
            while((s = br.readLine())!=null){
//                将字符串切割成数组
                String[] arr = s.split(",");
//                创建Product对象放进去商品属性 注意要加上强制类型转换
                Product product = new Product(arr[0], arr[1], Double.parseDouble(arr[2]), Integer.parseInt(arr[3]));
                product.compute();
//                System.out.println(product.getTotalPrice());
                list.add(product);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br!= null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return list;
    }
//    静态方法二 打印排序后的商品商品
    public static void OrderPrint(File file,ArrayList<Product> list){
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            bw.write(pro+"\n");
            for (int i = 0; i < list.size(); i++) {
                bw.write(list.get(i).getNum()+","+list.get(i).getName()+","+list.get(i).getPrice()+","+list.get(i).getQuantity()+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(bw != null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
    public static void MountPrint(File file,ArrayList<Product> list){
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            bw.write(pro+"\n");
            for (int i = 0; i < list.size(); i++) {
                bw.write(list.get(i).getNum()+","+list.get(i).getName()+","+list.get(i).getPrice()+","+list.get(i).getQuantity()+"\t"+list.get(i).getTotalPrice()+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(bw != null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
