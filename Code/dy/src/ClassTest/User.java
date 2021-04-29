package ClassTest;

public class User {
    private String name;
    private int balance;

    public User() {
    }

    public User(int balance) {
        this.balance = balance;
    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // 显示余额
    public void showInfo() {
        System.out.println("我叫: "+name+", 我有多少钱: "+balance);
    }
}
