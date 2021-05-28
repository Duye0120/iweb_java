import org.junit.Test;

public class test {
    public static void main(String[] args) {

    }
    @Test
    public void test1(){

                int x = 0;
                int y = 0;
                int k = 0;
                for (int z = 0; z < 5; z++) {
                    if ((++x > 2) && (++y > 2) && (k++ > 2))
                    {
                        x++;
                        ++y;
                        k++;
                    }
                }
                System.out.println(x + "" +y + "" +k);

    }
}
