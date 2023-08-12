package rao.day0216;

public class MethodsTest {
    public static void main(String[] args) {
        MethodsTest.sumInt(10, 20);
        sumInt(50, 20);
        //方法必须包含static才能被调用
        A.doSome();
    }
    //方法是一段代码片段，这段代码片段能完成某种特定的功能，可以被重复使用
    public static void sumInt(int a, int b) {
        int c = a + b;
        System.out.println(a + " + " + b + " = " + c );
    }
}

class A {
    public static void doSome() {
        System.out.println("doSomme is excuted in class A");
    }
}
