package rao.day0305;

public class InstanceTest {
    /***
     * 实例代码块
     * 1.
     */
    {
        System.out.println(1);
    }
    {
        System.out.println(2);
    }
    {
        System.out.println(3);
    }
    public InstanceTest() {
        System.out.println("构造函数InstanceTest执行");
    }
    public static void main(String[] args) {
        System.out.println("main方法执行");
        new InstanceTest();
    }
}
