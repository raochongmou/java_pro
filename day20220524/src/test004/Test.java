package test004;

public class Test {
    public Test() {
        System.out.println("Test");
    }
    //静态代码块在类加载时依次执行一次结束
    static {
        System.out.println("static");
    }
    //实例代码块在对象创建完后依次执行一次结束，在构造方法执行之前执行
    {
        System.out.println(1);
    }
    {
        System.out.println(2);
    }
    {
        System.out.println(3);
    }

    public static void main(String[] args) {
        System.out.println("main begin");
        new Test();
    }
}
