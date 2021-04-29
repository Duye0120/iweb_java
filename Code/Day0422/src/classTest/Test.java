package classTest;

public class Test {
    public static void main(String[] args) {
//        Kettle kettle = new Kettle();
        Kettle kettle = new KeepKettle();
        kettle.setColor("white");
        kettle.burn();
        if (kettle instanceof  KeepKettle) {
            ((KeepKettle)kettle).isKeep();
        }
    }
}
