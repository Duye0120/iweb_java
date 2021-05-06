package Exercise.HomeWork5;

import java.io.*;
import java.util.ArrayList;

public class Flow {
    public static ArrayList<Data> list = new ArrayList();

    public static ArrayList <Data> flowRead(File file)  {
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String s = null;
            while((s = br.readLine()) != null){
                String[] ss = s.split("\t");
               Data d =  new Data(Float.parseFloat(ss[0].trim()),Float.parseFloat(ss[1].trim()),
                        ss[2].trim(),ss[3].trim(),ss[4],ss[5],Integer.parseInt(ss[8].trim()),
                        Integer.parseInt(ss[9].trim()),Integer.parseInt(ss[10].trim()));
               list.add(d);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
    public static void flowPrint(File file){
        ArrayList<Data> dd = flowRead(file);
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(new File("C:\\Users\\admin\\Desktop\\java笔记\\四月三十号\\5.1作业\\flow1.log"));
            bw = new BufferedWriter(fw);
            for (int i = 0; i < dd.size(); i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(dd.get(i).getAccessTime());
                sb.append("\t");
                sb.append(dd.get(i).getPhoneNum());
                sb.append("\t");
                sb.append(dd.get(i).getIpAdress());
                sb.append("\t");
                sb.append(dd.get(i).getUp());
                sb.append("\t");
                sb.append(dd.get(i).getDown());
                sb.append("\t");
                sb.append(dd.get(i).getStatus());
                sb.append("\n");
                String sb1 = sb.toString();
                bw.write(sb1);
            }
            bw.write("totalup = " + totalUp(list) +"\t"+ "totaldown =" + totalDown(list)+"\t"+ "avgup = " + (totalUp(list)/list.size())+"\t"+ "avgdown = " + (totalDown(list)/list.size()) );
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(bw!= null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    public static int totalUp(ArrayList<Data> list){
        int i = 0;
        for (Data item :
                list) {
            i += item.getUp();
        }
        return i;
    }
    public static int totalDown(ArrayList<Data> list){
        int i = 0;
        for (Data item :
                list) {
            i += item.getDown();
        }
        return i;
    }
}
