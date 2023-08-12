package test001;

public class Customer {
    int num = 10;
    public static void main(String[] args) {
        //System.out.println(num);报错
        //System.out.println(this.num);报错
        //正确的访问方式
        Customer c = new Customer();
        System.out.println(c.num);
    }
}
