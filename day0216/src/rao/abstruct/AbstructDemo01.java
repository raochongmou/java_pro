package rao.abstruct;

public class AbstructDemo01 {
    public static void main(String[] args) {
        A a = new C();
        a.move();
    }
}

abstract class A {
    private String link;
    public abstract void move();
    public void doSome() {}
    public static final double PI = 3.1415926;

    public A() {
    }

    public A(String link) {
        this.link = link;
    }
}

abstract class B extends A {
}

//继承抽象类的类，父类如果有抽象方法，子类必须也是抽象类或者实现父类的方法
class C extends B {
    public void move() {
        System.out.println("B is executed!");
    }
}
//或
//abstract class C extends B {}