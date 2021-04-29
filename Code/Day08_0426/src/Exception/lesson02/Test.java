package Exception.lesson02;

public class Test {
    public static void main(String[] args) {
        try{
            System.out.println(1/1);
            int[] arr = {10,20,30};
            System.out.println(arr[4]);
            System.out.println("后面的代码");
        }catch (Exception e){
            System.out.println("算数");
            e.printStackTrace();// 打印异常栈追踪的内容
        }

    }
}
