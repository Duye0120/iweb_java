package classTest;

public class KeepKettle  extends  Kettle{
    private boolean keep = false; // false

    public void isKeep() {
        this.keep = !this.keep;
        System.out.println(this.keep?"保温":"取消保温");
    }

}
