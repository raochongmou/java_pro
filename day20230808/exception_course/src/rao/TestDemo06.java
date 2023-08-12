package rao;

public class TestDemo06 {
    public static void main(String[] args) {
        A a = new A();
        a.doSome();
    }
    public void doSome() {
        System.out.println("aaa");
    }
}

class A extends TestDemo06 {
    // 重写方法抛出异常可以更少不能更多针对编译时异常
    public void doSome() throws RuntimeException {
        System.out.println("bbb");
    }
}
