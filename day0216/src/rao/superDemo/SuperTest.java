package rao.superDemo;

public class SuperTest {
    public static void main(String[] args) {
        new B();
    }
}

class A extends SuperTest {
    public A() {}
    public A(int i) {
        System.out.println("A的有参数构造函数被调用(int)!");
    }
}

class B extends A {
    public B() {
        //super和this二者只能有一个出现在第一行
        //super(200);//调用父类的构造函数
        //this("张三");
        System.out.println("B的无参数构造函数被调用!");
    }
    public B(String name) {
        //super(100);
        System.out.println("B的String参数构造函数被调用!");
    }
}
