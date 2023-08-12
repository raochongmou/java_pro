package rao.day0216;

public class OverloadTesst {
    public static void main(String[] args) {
        U.log("intMethod===>" + method(10, 20));
        U.log("doubleMethod===>" + method(1.0, 2.0));
        U.log("longMethod===>" + method(10L, 20L));
//        System.out.println("intMethod" + intMethod(10, 20));
//        System.out.println("doubleMethod" + doubleMethod(1.0, 2.0));
//        System.out.println("longMethod" + longMethod(10L, 20L));
    }
    //方法重载机制
    public static int method(int a, int b) {
        return a + b;
    }
    public static double method(double a, double b) {
        return a + b;
    }
    public static long method(long a, long b) {
        return a + b;
    }
//    public static int intMethod(int a, int b) {
//        return a + b;
//    }
//    public static double doubleMethod(double a, double b) {
//        return a + b;
//    }
//    public static long longMethod(long a, long b) {
//        return a + b;
//    }
}
