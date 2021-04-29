package lesson_interface;

public class Test {
    public static void main(String[] args) {
        System.out.println(Service.USERNAME);

        UserService service = new UserService();
        service.show();
    }
}
