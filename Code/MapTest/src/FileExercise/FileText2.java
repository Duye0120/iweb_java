package FileExercise;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


/**
*@author shark
*@date 2021/4/28 16:30
*@param 
*@return 
*desc 
*/
public class FileText2 {
    public static void main(String[] args) {
        FileText2 fileText2 = new FileText2();
        List<String> all = fileText2.getALL("C:\\Users\\admin\\Desktop\\java笔记\\四月二十八号\\笔记", new ArrayList<>());

        for (String item :
                all) {
            System.out.println(item);
        }
    }
    public List<String> getALL(String filepath,List<String> list){
        File file = new File(filepath);

        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()){
                list.add(files[i].getName());
            }else{
                getALL(files[i].getAbsolutePath(),list);
            }
        }
        return list;
    }


}
