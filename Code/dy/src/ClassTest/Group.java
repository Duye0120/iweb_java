package ClassTest;

import java.util.ArrayList;

public class Group {
    public static void main(String[] args) {
        GroupManager manager = new GroupManager("群主", 100);

        Member a = new Member("成员a", 0);
        Member b = new Member("成员b", 0);
        Member c = new Member("成员c", 0);

        manager.showInfo();
        a.showInfo();
        b.showInfo();
        c.showInfo();
        System.out.println("====================");

        // 群主总共发20块钱，分成3个红包
        ArrayList<Integer> redList = manager.send(20, 3);
        // 三个普通成员收红包
        a.receive(redList);
        b.receive(redList);
        c.receive(redList);

        manager.showInfo(); // 100 - 20 = 80
        // 6 6 8
        a.showInfo();
        b.showInfo();
        c.showInfo();

    }
}
