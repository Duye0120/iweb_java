package lesson02;

public class Phone {
    private String model;// 型号
    private int memory;// 内存

    // 1. 使用构造函数进行初始化
    public Phone(String model,int memory) {
        this.model = model;
        this.memory = memory;
    }



    // 拍照
    public void camera(){
        System.out.println("拍照");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

}
