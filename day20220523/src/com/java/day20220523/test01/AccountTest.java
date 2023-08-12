package com.java.day20220523.test01;

public class AccountTest {
    public static void main(String[] args) {
        Account a = new Account();
        a.setActNo("工行001");
        String accno = a.getActNo();
        System.out.println(accno);
        int i = 10;
        add(i);
        System.out.println(i);
    }
    public static void add(int i) {
        i++;
        System.out.println(i);
    }
}
