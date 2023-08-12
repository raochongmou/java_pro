package com.bjpowernode.day20220513;

public class User {
    //构造函数语法: [修饰符列表(public)] 构造函数名称() {}
    //当一个类显式的将构造方法定出来,那么系统将不再默认为这个类提供缺省构造器
    //开发中建议手动的为类添加无参数的构造方法
    //构造方法支持重载机制
    public User() {
        System.out.println("构造方法执行回调!");
    }
    public User(int i) {
        System.out.println("构造方法参数为int类型");
    }
    public User(String name) {
        System.out.println("构造方法参数为String类型");
    }
    public User(String addr, boolean isSex) {
        System.out.println("构造方法参数为String,boolean类型");
    }
    public void says() {
        System.out.println("says");
    }
}
