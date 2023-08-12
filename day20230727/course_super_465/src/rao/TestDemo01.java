package rao;

public class TestDemo01 {
    public static void main(String[] args) {
        new B();
    }
}

class A {
    public A() {
        System.out.println("构造方法A被调用!");
    }
    public A(int i) {
        System.out.println("有参构造方法A被调用!" + i);
    }
}

class B extends A {
    public B() {
        // super(55);
        this("张三");
        System.out.println("构造方法B被调用!");
    }
    public B(String name) {
        System.out.println("有参构造方法B被调用!" + name);
    }
}
