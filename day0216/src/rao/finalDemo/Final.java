package rao.finalDemo;

import rao.day0306.Cat;
import rao.day0306.PackageTest;

public final class Final {
    //1.final是一个关键字,表示最终的,不可变的.
    //2.final修饰的类无法被继承
    //3.final修饰的方法无法被覆盖
    //4.final修饰的变量"一旦"赋值之后,不可重新赋值[不可二次赋值]
    final int a;
    //常量
    public final static String country = "中国";
    public Final() {
        a = 100;
    }
}

//class C extends Final {
//
//}
class C {
    public static void main(String[] args) {
        System.out.println(Final.country);
        final Final f = new Final();
        Cat c = new Cat();
        System.out.println(c);
        //f = new Final();
    }
}

class D extends PackageTest {
    public static void main(String[] args) {
        D pt = new D();
        System.out.println(pt.i);//protected 同包下、子类均可访问
        //System.out.println(pt.k);//private 只有当前类中可访问
        //System.out.println(pt.j);//缺省 只能在同包下访问
    }
}