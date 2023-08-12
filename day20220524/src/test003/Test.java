package test003;

public class Test {
    public static void main(String[] args) {
        Test.method();
        method();
        Test t = new Test();
        t.method();
        t = null;
        //此处不会报空指针异常，使用引用的方式调用带有static的方法会报警告 但是不会报错  可以正常运行
        t.method();
    }
    public static void method() {
        System.out.println("method");
    }
}
