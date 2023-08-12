package rao;

@SuppressWarnings({"all"})
public class TestDemo02 {
    public static void main(String[] args) {
        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b);// false
        /*
         * java中为了提高程序的执行效率，将[-128到127]之间所有的包装对象提前放
         * 到了一个方法区的“整数型常量池”当中了，
         * 目的是只要用这个区间的数据不需要再new了，直接从整数型常量池中取出来。
         * 原理：x变量中保存的对象的内存地址和y变量中保存的对象的内存地址是一样的。
         */
        Integer x = 127;
        Integer y = 127;
        System.out.println(x == y);// true

        int i = Integer.parseInt("555");
        System.out.println("i:" + i);
        double d = Double.parseDouble("3.1415926");
        System.out.println("d:" + d);
        float f = Float.parseFloat("555.00");
        System.out.println("f:" + f);
        String binaryString = Integer.toBinaryString(3);
        System.out.println("binaryString:" + binaryString);
        // 1,2,3,4,5,6,7,8,9,a,b,c,d,e,f,10,
        // 11,12,13,14,15,16,17,18,19,1a
        // 1b,1c,1d,1e,1f,20
        String hexString = Integer.toHexString(42);
        System.out.println("hexString:" + hexString);

    }
}
