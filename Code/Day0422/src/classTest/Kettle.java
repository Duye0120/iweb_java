package classTest;

public class Kettle {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 烧水
     */
    public void burn() {
        System.out.println("电水壶烧水");
        warning();
    }

    private void warning() {
        System.out.println("嘟.....");
    }
}
