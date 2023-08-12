package rao;

@SuppressWarnings({"all"})
public class TestDemo01 {
    public static void main(String[] args) {
        MyInt mi = new MyInt(100);
        doSome(mi);
        // 基本数据类型转化为引用数据类型称之为装箱
        Integer i = new Integer(100);
        // 引用数据类型转化为基本数据类型称之为拆箱
        double d = i.doubleValue();
        System.out.println("d: " + d);
        float f = i.floatValue();
        System.out.println("f:" + f);
        Integer i2 = new Integer("100");
        System.out.println("i2: " + i2);
    }

    public static void doSome(Object obj) {
        System.out.println(obj);
    }
}
