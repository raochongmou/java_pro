package com.bjpowernode.day20220513;

public class CustomerTest {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.setAge(110);
        c.setName("我是菜鸟二号");
        c.setAddr("我是菜鸟一号");
        System.out.println(c.getAge());
        System.out.println(c.getName());
        System.out.println(c.getAddr());
    }
}
