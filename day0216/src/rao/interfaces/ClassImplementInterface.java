package rao.interfaces;

public class ClassImplementInterface {
    public static void main(String[] args) {
        A1 a1 = new D1();
        B1 b1 = new D1();
        C1 c1 = new D1();
        //a1要访问B1的m2方法
        B1 b2 = (B1)a1;
        b2.m2();
    }
}

interface A1 {
    void m1();
}
interface B1 {
    void m2();
}
interface C1 {
    void m3();
}

class D1 implements A1, B1, C1 {
    //public 不可省略,因为接口中定义的是public 访问权限不能更低可以更高的原则
    public void m1() {
        System.out.println("m1 is invoked!");
    }
    public void m2() {
        System.out.println("m2 is invoked!");
    }
    public void m3() {
        System.out.println("m3 is invoked!");
    }
}

interface M {};
interface N {};
class A3 implements M {
    public void m() {
        System.out.println("m is invoked!");
    }
}
class Test001 {
    public static void main(String[] args) {
        M m1 = new A3();
        // 编译不会报错 但是运行会报错--java.lang.ClassCastException
        N n1 = (N)m1;
    }
}