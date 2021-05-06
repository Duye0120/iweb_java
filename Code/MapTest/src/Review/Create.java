package Review;

import java.util.List;

public class Create implements Runnable{
    private List list;

    public Create(List list) {
        this.list = list;
    }

    @Override
    public void run() {

        while (true){
            synchronized (list){
                if(list.size()==2){
//                容量满了就不生产
                    try {
                        System.out.println("满");
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
//            容量不满就就可以生产元素
                int a = (int) Math.round((Math.random()*10));
                list.add(a);
                System.out.println("生产了"+a);
                list.notifyAll();
            }
        }
    }
}
