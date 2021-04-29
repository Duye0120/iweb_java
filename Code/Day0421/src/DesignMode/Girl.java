package DesignMode;

public class Girl {
    private String name;
    private int faceValue;


    public Girl() {
    }

    public Girl(String name, int faceValue) {
        this.name = name;
        this.faceValue = faceValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    public void marryTo(Boy boy){
        if (boy.getWealth() > 1000) {
            System.out.printf("%s,say: 颜值达标....\n",this.name);
            System.out.printf("%s,say:考虑一下,嫁给: %s\n",this.name,boy.getName());
            return;
        }
        if (boy.getWealth() <= 1000) {
            System.out.printf("%s,say: 没钱,不考虑....\n",this.name);
            return;
        }
    }
}
