package rao.day0220;

public class User {
    public User() {
        System.out.println("User constructor is invoked!");
    }
    public User(int i) {
        System.out.println("i" + i);
    }
    public User(String i) {
        System.out.println("i" + i);
    }
    public User(boolean i) {
        System.out.println("i" + i);
    }
    public User(float i) {
        System.out.println("i" + i);
    }
    public User(byte i) {
        System.out.println("i" + i);
    }
    public User(User i) {
        System.out.println("i" + i.age);
    }
    private int age;
    int a;

    public int get() {
        return age;
    }

    public void set(int age) {
        if(age > 100 | age < 0) {
            System.out.println("你设置的年龄不合法");
            return;
        }
        User u = new User();
        System.out.println(this);
        System.out.println(u);
        this.age = age;
    }
}
