package lesson_interface;

public class UserService implements Service{

    @Override
    public void show() {
        System.out.println("use show");
    }
}
