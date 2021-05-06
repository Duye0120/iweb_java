package Exercise.HomeWork1;

public class Exchange implements Runnable {
    private Node node;

    public void setNode(Node node) {
        this.node = node;
    }

    @Override
    public void run() {
        synchronized ("lock1"){
            for (int i = 0; i < 5; i++) {
                this.node.myPrint();
            }
        }

    }
}
