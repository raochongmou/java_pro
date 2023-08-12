package rao.interfaces;

/**
 * 1.接口编译后会生成.class文件
 * 2.接口是完全抽象的,抽象类是半抽象的
 * 3.接口内部只能存在常量和抽象方法
 * 4.接口内定义抽象方法时可以省略[修饰符列表] abstract
 * 5.接口支持多继承
 * 6.接口的抽象方法修饰符只能用public
 */
public class InterfaceDemo01 {
    public static void main(String[] args) {
        System.out.println("PI: " + A.PI);
    }
}
//接口的定义
interface A {
    //常量
    //public static final double PI = 3.1415926;
    //简写
    double PI = 3.1415926;
    //public abstract int sum(int a, int b);
    //public可以省略
    //abstract int sum(int a, int b);
    //public abstract都可以省略
    int sum(int a, int b);
}
//接口可以继承
interface B extends A {}
//接口支持多继承
interface C extends A, B {}