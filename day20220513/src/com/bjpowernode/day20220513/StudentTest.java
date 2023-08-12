package com.bjpowernode.day20220513;

public class StudentTest {
    public static void main(String[] args) {
        //创建一个学生类
        Student s = new Student();
        s.no = 110;
        s.name = "张三";
        s.sex = true;
        s.addr = "武汉";
        s.age = 18;
        System.out.println(s.no);
        System.out.println(s.name);
        System.out.println(s.sex);
        System.out.println(s.addr);
        System.out.println(s.age);
    }
}
