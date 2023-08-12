package rao;

public class TestDemo01 {
    public static void main(String[] args) {
        Address a1 = new Address("大冶市", "435100", "大冶东岳街道");
        Address a2 = new Address("大冶市", "435100", "大冶东岳街道");
        User u1 = new User("小张", a1);
        User u2 = new User("小张", a2);
        System.out.println(u1.equals(u2));
    }
}
