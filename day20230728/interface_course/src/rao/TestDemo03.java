package rao;



public class TestDemo03 {
    public static void main(String[] args) {
        AI ai = new D();
        BI bi = new D();
        CI ci = new D();
        // 强制类型转换
        BI bi1 = (BI) ai;
        bi1.m2();
    }
}

interface AI {
    // 这里省略了(public)
    void m1();
}

interface BI {
    // 这里省略了(public)
    void m2();
}

interface CI {
    // 这里省略了(public)
    void m3();
}

class D implements AI, BI, CI {
    public void m1() {
        System.out.println("m1 ......");
    }
    public void m2() {
        System.out.println("m2 ......");
    }
    public void m3() {
        System.out.println("m3 ......");
    }
}
