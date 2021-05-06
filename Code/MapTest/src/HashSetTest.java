import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {
//        HashSet<String> hashSet = new HashSet<>();
//        hashSet.add("nihao");
//        hashSet.add("buhao");
//        hashSet.add("");
//        hashSet.add("最后一个");
//        Iterator<String> it = hashSet.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//        System.out.println(hashSet);
        HashSet<User> hashSet = new HashSet<>();
        hashSet.add(new User("zhanghuan",22));
        hashSet.add(new User("zhanghuan1",23));
        hashSet.add(new User("zhanghuan",22));
        System.out.println(hashSet);
    }
}
