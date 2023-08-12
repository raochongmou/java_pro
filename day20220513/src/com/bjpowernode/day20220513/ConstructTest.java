package com.bjpowernode.day20220513;

public class ConstructTest {
    public static void main(String[] args) {
        new User().says();
        new User(100);
        new User("张三");
        new User("王五", false);
        int i = 10;
        add(i);
        System.out.println(i);
    }
    public static void add(int i) {
        i++;
        System.out.println(i);
    }
}
