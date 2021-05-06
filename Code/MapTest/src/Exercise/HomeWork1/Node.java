package Exercise.HomeWork1;

public class Node {
    private int vary = 1;
    public void myPrint(){
        if(vary ==1){
            System.out.println("A");
            vary = -1;
        }else{
            System.out.println("B");
            vary = 1;
        }
    }
}
