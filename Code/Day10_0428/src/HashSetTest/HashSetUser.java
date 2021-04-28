package HashSetTest;

import java.util.HashSet;

public class HashSetUser {
    public static void main(String[] args) {
        HashSet<Object> users = new HashSet<>();
        users.add(new User(1,"admin"));
        users.add(new User(2,"jack"));

        System.out.println(users.size());
        // 简单的输出方式
        System.out.println(users.toString());
    }
}
