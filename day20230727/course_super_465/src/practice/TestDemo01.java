package practice;

import java.util.Scanner;

public class TestDemo01 {
    public static void main(String[] args) {
        A a = new A(100);
        B b = new B(a);
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你要猜的数字:");
            int sc_num = sc.nextInt();
            b.guess(sc_num);
        }
    }
}

class A {
    private int v;
    public A() {};
    public A(int v) {
        this.v = v;
    }
    public void setV(int v) {
        this.v = v;
    }
    public int getV() {
        return this.v;
    }
}

class B {
    private A a;
    public B() {};
    public B(A a) {
        this.a = a;
    }

    public void setA(A a) {
        this.a = a;
    }
    public A getA() {
        return this.a;
    }
    public void guess(int num) {
        int reality = this.a.getV();
        if(num == reality) {
            System.out.println("恭喜猜对了!");
            // 强行退出jvm
            System.exit(0);
        } else if(num > reality) {
            System.out.println("对不起，猜大了!");
        } else {
            System.out.println("对不起，猜小了!");
        }
    }
}
