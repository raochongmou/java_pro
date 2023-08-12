package rao.interfaces;

public class InterfaceImplementDemo {
    public static void main(String[] args) {
        //面向接口编程
        //父类型引用指向子类型对象(多态)
        Cat c = new CatImplement();
        int res = c.sum(100, 120);
        System.out.println("res: " + res);
    }
}

interface Cat {
    double PI = 3.1415926;
    int sum(int a, int b);
    int sub(int a, int b);
}

//implements相当于extends(继承)
//由于interface接口类型是引用数据类型的全抽象
//要么子类也是抽象类  要么子类去实现继承过来的方法
//abstract class CatImplement implements Cat {}
class CatImplement implements Cat {
    public int sum(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a - b;
    }
}