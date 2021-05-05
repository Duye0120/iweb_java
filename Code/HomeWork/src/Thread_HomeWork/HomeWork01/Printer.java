package Thread_HomeWork.HomeWork01;


public class Printer {

    // 判断是否可以打印
    private boolean hasBufferToPrint = false;

    public synchronized  void PrintA() {
        while (hasBufferToPrint) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("A");
        hasBufferToPrint = true;
        notify();  // 唤醒B
    }

    public synchronized  void PrintB() {
        while (!hasBufferToPrint) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("B");
        hasBufferToPrint = false;
        notify();  // 唤醒A
    }

    static class ThreadA extends Thread{
        private Printer printer;

        public ThreadA(Printer printer) {
            this.printer = printer;
        }
        public void run(){
            for (int i = 0; i < 10; i++) {
                printer.PrintA();
            }
        }
    }

    static class ThreadB extends Thread{
        private Printer printer;

        public ThreadB(Printer printer) {
            this.printer = printer;
        }
        public void run(){
            for (int i = 0; i < 10; i++) {
                printer.PrintB();
            }
        }
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        ThreadA a = new ThreadA(printer);
        ThreadB b = new ThreadB(printer);
        a.start();
        b.start();
    }
}
