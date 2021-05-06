package FileExercise;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FileText3 {
    public static void main(String[] args) {
        File file1 = new File("C:\\Users\\admin\\Desktop\\java笔记\\文件归类\\java.html");
        File file2 = new File("C:\\Users\\admin\\Desktop\\java笔记\\文件归类\\ni2\\java1.html");
        System.out.println(1);
        System.out.println(file1.renameTo(file2));
        System.out.println(1);
    }
//把文件归类的方法
    public void range(){
//        首先取得这个文件下所有的文件
        List<String> all = new FileText2().getALL("E:\\前端资料\\文件归类", new ArrayList<>());
//        创建一个Couter类来保存计数
        HashMap<String,Couter> hashMap = new HashMap<>();
        for (int i = 0; i < all.size(); i++) {
            if(!hashMap.containsKey(all.get(i))){
                hashMap.put(all.get(i),new Couter());
            }else{
                hashMap.get(all.get(i)).add();
            }
//          获取数量
            int count = hashMap.get(all.get(i)).getCount();
          String filename = translate(all.get(i),count);
          File file = new File("E:\\前端资料\\"+all.get(i));
//          查看是否有这个文件夹
            if (!file.exists()){
                file.mkdirs();
            }

        }
    }
//    相同字符串进行变化
    public String translate(String s,int num){
        String suffix = s.substring(s.lastIndexOf('.') + 1);
        String filename = s.substring(0,s.lastIndexOf('.'));
        return filename + num+"."+ suffix;
    }
}
