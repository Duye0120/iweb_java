import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Character> treeSet = new TreeSet<>();
        treeSet.add('c');
        treeSet.add('a');
        treeSet.add('f');
        treeSet.add('b');
        treeSet.add('b');
//        默认调用compareto方法所以会出现空指针异常
//        treeSet.add(null);
       Iterator<Character> it =  treeSet.iterator();
        System.out.println(treeSet);
        for (Character item :
                treeSet) {
            System.out.println(item);
        }
    }

}
