package Exercise.HomeWork4;
/**
*@author shark
*@date 2021/5/4 12:35
*desc 这是一个产品类里面产品的价格、销量等信息
*/
public class Product {
    private String num;

    private String name;

    private double price;

    private int quantity;//数量

    private double totalPrice;

    public void compute(){
        totalPrice = this.price * this.quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Product(String num, String name, double price, int quantity) {
        this.num = num;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

}
