package rao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

@SuppressWarnings({"all"})
public class TestDemo02 {
    /**
     * 注意:
     *      只要异常没有捕捉，采用上报的方式，此方法的后续代码不会执行。
     *      另外需要注意，try语句块中的某一行出现异常，该行后面的代码不会执行。
     *      try...catch捕捉异常之后，后续代码可以执行。
    * */
    public static void main(String[] args) {
        try {
            m1();
            System.out.println("如果以上方法调用程序出现异常try...语句后续代码无法执行");
        }
        // catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // }
        // catch (Exception e) {
        //     e.printStackTrace();
        // }
        // jdk8的新特性 允许使用|来编写多个异常类
        catch (NullPointerException | FileNotFoundException e) {
            String msg = e.getMessage();
            System.out.println(msg);
            e.printStackTrace();
        }
        System.out.println("try。。。catch后续可以被执行");
    }

    private static void m1() throws FileNotFoundException {
        System.out.println("m1开始");
        m2();
        System.out.println("m2执行结束");
    }

    private static void m2() throws FileNotFoundException {
        System.out.println("m2开始");
        m3();
    }

    private static void m3() throws FileNotFoundException {
        System.out.println("m3开始");
        // 如果路径出错 则以上所有连续调用都会出现异常
        FileInputStream fis = new FileInputStream("C:\\User\\Administrator\\Desktop\\发布代码.txt");
        // System.out.println(fis);
    }
}
