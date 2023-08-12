package rao1;

public class TestDemo01 {
    public static void main(String[] args) {
        // for(int i = 0; i < 1000000; i++) {
            Person p1 = new Person();
            p1 = null;
            System.gc();
        // }
        Object o = new Object();
        System.out.println(o.hashCode());
    }
}

class Person {
    // 当垃圾回收期执行时被调用 由GC机制自动调用
    protected void finalize() throws Throwable {
        System.out.println("垃圾回收器被执行!");
    }
}
