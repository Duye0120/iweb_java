package HomeWork.DateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 3. 日期类的练习
 移动公司的计费系统设计：0:00:00-23:59:59

 8:00:00 - 19:59:59  2毛/分钟
 20:00:00 - 7:59:59  1毛/分钟

 计算用户的每次通话的费用
 */
public class DateTest {

    //时间不够了，说一下思路
    /*
    将所有需要注意的时间全部转化为long类型的数值
    会发现，每个时间点都是拥有固定的一个long数值
    00:00:00 -> -28800000
    8:00:00 -> 0
    19:59:59 -> 43199000
    20:00:00 -> 43200000
    23:59:59 -> 57599000
    所以，一天的时间就是从-28800000到57599000（不包括毫秒）
    我们需要将输入的时间转换为long值，
    开始判断
    >>>00:00:00-------------07:59:59--08:00:00-------------19:59:59--20:00:00------------23:59:59--00:00:00<<<
    以上为一个循环
    1. 判断开始的时间是否>0 是 -> 判断结束时间是否小于43199000  是 ->    用结束时间减去开始时间，转化为分钟以后并用两毛的价格计算
                                                        否 ->    则超过，超过就用43199000-0化为分钟，并用两毛计算以后+结束时间-43199000转化为分钟以后用1毛计算
     */
    public static void main(String[] args) throws ParseException {
        String morningStarTime = "00:00:00";
        String morningEndTime = "19:59:59";
        String eveningStartTime = "20:00:00" ;
        String eveningEndTime = "23:59:59";
        long mStarTime = changeToLong(morningStarTime);
        long mEndTime = changeToLong(morningEndTime);
        long eStarTime = changeToLong(eveningStartTime);
        long eEndTime = changeToLong(eveningEndTime);
        System.out.println(mStarTime);
        System.out.println(mEndTime);
        System.out.println(eStarTime);
        System.out.println(eEndTime);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入电话开始时间，格式为HH:mm:ss");
        String enterTime = sc.next();
        System.out.println("请输入电话开始时间，格式为HH:mm:ss");
        String endTime = sc.next();
        long longStartTime = changeToLong(enterTime);
        System.out.println("开始时间转换为毫秒为："+ longStartTime);
        long longEndTime = changeToLong(endTime);
        System.out.println("结束时间转换为毫秒为："+ longStartTime);

        // 获得开始的时间
        // 获得结束的时间
    }
    public static long changeToLong(String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Date parse = sdf.parse(str);
        return parse.getTime();
    }

    /**
     * 用来计算中间发生了多长时间
     * @param startTime
     * @param endTime
     * @return 返回中间持续了多长时间
     */

    /**
     * 用来计算其中的时间
     * 1. 判断开始的时间所在时间段
     * 2. 判断开始时间+持续时间是否超过8点
     * 3. 如果没有,则返回null,如果有则返回超过8点的时间
     */

    /**
     * 用来计算费用
     * 在20:00:00-7:59:59所需要的费用
     * 在8:00:00-19:59:59所需要的费用
     */
    
}
class Time{

}
