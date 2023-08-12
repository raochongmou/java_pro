package rao.day0216;

public class User {
    int no;
    String name;
    boolean sex;
    Address addr;

    public static void main(String[] args) {
        User u1 = new User();
        u1.no = 110;
        u1.name = "rao";
        u1.addr = new Address();
        System.out.println("编号"+u1.no);
        System.out.println("地址"+u1.addr.addr);
    }
}
