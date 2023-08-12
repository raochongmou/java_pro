package rao.day0220;

public class UserTest {
    public static void main(String[] args) {
        User u = new User();
        System.out.println("-----------");
        u.set(18);
        System.out.println(u.get());
        User u1 = new User(10);
        User u2 = new User("rao");
        User u3 = new User(0.0f);
        //User u4 = new User(10.25);
        User u5 = new User(true);
        User u6 = new User(127);
        User u7 = new User(u.get());
    }
}
