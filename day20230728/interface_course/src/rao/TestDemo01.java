package rao;

public class TestDemo01 {
    public static void main(String[] args) {
        A a = new A(10);
        System.out.println("a:" + a.i);
    }

}

class A {
    int i;

    public A(int jjjj) {
        i = jjjj;
    }
}

