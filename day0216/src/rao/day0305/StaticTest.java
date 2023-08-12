package rao.day0305;

public class StaticTest {
    /***
     * 可以使用static关键字来定义"静态代码块"
     *      1.语法格式
     *          static {
     *              java语句
     *          }
     *      2.静态代码块在类加载时执行,并且只执行一次。
     *      3.静态代码块在一个类中可以编写多个,并且遵循自上而下的顺序一次执行
     *      4.
     */
    int i;
    static {
        StaticTest st = new StaticTest();
        st.i = 50;
        System.out.println("类型加载---1 " + st.i);
    }
    static {
        System.out.println("类型加载---2");
    }
    static {
        System.out.println("类型加载---3");
    }
    public static void main(String[] args) {
        System.out.println("main方法执行");
    }
}
