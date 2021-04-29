package DesignMode;

public class Boy {
    private String name;
    private int wealth;

    public String getName() {
        return name;
    }

    public Boy() {
    }

    public Boy(String name, int wealth) {
        this.name = name;
        this.wealth = wealth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWealth() {
        return wealth;
    }

    public void setWealth(int wealth) {
        this.wealth = wealth;
    }

    public void getGirl(Girl girl){
        if (girl.getFaceValue() > 100) {
            System.out.printf("%s,say: 颜值达标....\n",this.name);
            System.out.printf("%s,say: 我要娶妻: %s\n",this.name,girl.getName());
            return;
        }
        if (girl.getFaceValue() <= 100) {
            System.out.printf("%s,say: 颜值不够,不考虑....\n",this.name);
            return;
        }
    }
}
