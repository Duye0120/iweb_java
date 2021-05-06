import java.util.Comparator;

public class UserCompareable implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        if (o1.getNum() < o2.getNum())
            return 1;
        if(o1.getNum() > o2.getNum())
            return -1;
        return o1.getName().compareTo(o2.getName());
    }
}
