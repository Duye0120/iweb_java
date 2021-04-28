package HashSetTest;

public class User {
    private Integer id;
    private String name;

    public User() {
    }

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 将次方法注释调用，让hashset调用Object的hashCode方法。
    // 则hashCode不同，不会调用equals
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ",name='" + name + '\''+
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("equals(Object obj)");
        return true;
    }
}
