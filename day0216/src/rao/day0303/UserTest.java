package rao.day0303;

public class UserTest {
    public static void main(String[] args) {
        User u = new User(20);
        int resAdd = add(u);
        System.out.println("resAdd " + resAdd);
        System.out.println("u " + u.age);
    }
    public static int add(User u) {
        u.age++;
        return u.age;
    }
}

class User {
    int age;
    public User(int age) {
        this.age = age;
    }
}
