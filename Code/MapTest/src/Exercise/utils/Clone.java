package Exercise.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Clone {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        copy(new File("C:\\Users\\admin\\Desktop\\ajax"),new File("E:\\前端资料\\File"),list);
        System.out.println(list);
    }
//
    /**
    *@author shark
    *@date 2021/5/2 17:06
    *desc
    */
    public static void copy(File src, File des, List l){
//        l数组保存需要拷贝文件的文件夹和子文件夹
        if (src.isDirectory()){
            if (l.size() == 0){
                l.add(src.getAbsolutePath().substring(src.getAbsolutePath().lastIndexOf("\\")));
                System.out.println(des.getAbsolutePath()+l.get(0));
            }else{
                String s = (String) l.get(0);
                l.add(src.getAbsolutePath().substring(src.getAbsolutePath().lastIndexOf(s)));
            }
        }
//        利用递归去复制
        File[] files =src.listFiles();
        for (File item :
                files) {
            if (item.isDirectory()) {
                copy(item, des, l);
            }
            else {
                new File(des.getAbsolutePath() + l.get(l.size() - 1)).mkdir();
                FileInputStream fis = null;
                FileOutputStream fos = null;
                try {
                    byte[] bytes = new byte[1024];
                    fis = new FileInputStream(item);
                    fos = new FileOutputStream(des.getAbsolutePath() + item.getAbsolutePath().substring(src.getAbsolutePath().lastIndexOf((String) l.get(0))));
                    int index = 0;
                    while ((index = fis.read(bytes)) != -1) {
                        fos.write(bytes, 0, index);
                        fos.flush();
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (fis != null) {
                        try {
                            fis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (fos != null) {
                        try {
                            fis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }


}
