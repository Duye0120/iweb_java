package Exercise.HomeWork3;

public class Ticket {
//    初始化票为10张
    private int count=10;

    public int getCount() {
        return count;
    }
    public boolean purchase(int num){
        if(this.getCount() == 0){
            System.out.println("票已经售空了"+Thread.currentThread().getName()+"购票失败");
            return false;
        }
        if(num > this.getCount()){
            System.out.println("余票不足"+Thread.currentThread().getName()+"购买失败");
            return false;
        }
        this.count -= num;
        System.out.println("恭喜"+ Thread.currentThread().getName()+"成功购买了" + num + "张票");
        return true;
    }
}
