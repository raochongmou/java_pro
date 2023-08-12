package rao.superDemo;

public class SuperTest01 {
    public static void main(String[] args) {
        new C1();//1435
        new C1(100);//14326
    }
}

class A1 {
    public A1() {
        System.out.println(1);
    }
}

class B1 extends A1 {
    public B1() {
        this("张三");
        System.out.println(2);
    }
    public B1(String name) {
        this("李四", 100);
        System.out.println(3);
    }
    public B1(String name, int a) {
        super();
        System.out.println(4);
    }
}

class C1 extends B1 {
    public C1() {
        super("王五");
        System.out.println(5);
    }
    public C1(int i) {
        System.out.println(6);
    }
}
