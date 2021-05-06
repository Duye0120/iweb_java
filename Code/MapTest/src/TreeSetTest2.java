import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest2 {
    public static void main(String[] args) {
//        TreeSet<User> treeSet = new TreeSet<>(new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
//                if (o1.getNum() < o2.getNum())
//                    return 1;
//                if(o1.getNum() > o2.getNum())
//                    return -1;
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
        TreeSet<User> treeSet = new TreeSet<>(new UserCompareable());
        treeSet.add(new User("zhanghuan",1));
        treeSet.add(new User("zhanghuan",2));
        treeSet.add(new User("zhanghuan",3));
        System.out.println(treeSet);
    }

}
