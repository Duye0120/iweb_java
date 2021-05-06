import java.util.Objects;

public class User implements Comparable<User> {
    private String name;
    private int num;

    public User(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    @Override
//    如果hash值一样则去调用equals方法

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return num == user.num &&
                Objects.equals(name, user.name);
    }

    @Override
//    如果两个hash值不一样那么这两个对象一定不一样
    public int hashCode() {
        return Objects.hash(name, num);
    }

    @Override

    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }

    @Override
    public int compareTo(User o) {
        if (this.num > o.num)
            return 1;
        if(this.num < o.num)
            return -1;
        return this.name.compareTo(o.name);
    }
}
