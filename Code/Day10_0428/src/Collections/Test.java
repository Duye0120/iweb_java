package Collections;

import HashMap.lesson01.User;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9,1,3,6,2);

        // 正序
        Collections.sort(list);
        System.out.println(list);
        // 倒序
        Collections.reverse(list);
        System.out.println(list);
        // 随机
        Collections.shuffle(list);
        System.out.println(list);

        List<User> users = Arrays.asList(
                new User(1,"jack"),
                new User(3,"tom"),
                new User(2,"tom")
        );

        Collections.sort(users, new Comparator<User>(){
            @Override
            public int compare(User o1, User o2) {
                return  o1.getId().compareTo(o2.getId());
            }
        });
        System.out.println(users);
    }
}
