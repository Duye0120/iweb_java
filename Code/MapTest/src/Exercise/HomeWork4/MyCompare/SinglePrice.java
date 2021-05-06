package Exercise.HomeWork4.MyCompare;

import Exercise.HomeWork4.Product;

import java.util.Comparator;

public class SinglePrice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getPrice() > o2.getPrice()) return 1;
        if(o1.getPrice() < o2.getPrice()) return -1;
        return o1.getName().compareTo(o2.getName());

    }
}
