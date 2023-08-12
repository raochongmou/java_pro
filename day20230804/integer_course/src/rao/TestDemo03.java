package rao;

@SuppressWarnings({"all"})
public class TestDemo03 {
    public static void main(String[] args) {
        // int --> String
        int i = 100;
        // 字符串拼接方式
        String s = i + "";
        System.out.println("s:" + s);
        // 调用String类的静态方法valueOf();
        String s2 = String.valueOf(i);
        System.out.println("s2:" + s2);
        // String --> int
        String s1 = "101";
        int i1 = Integer.parseInt(s1);
        System.out.println("i1:" + i1);
        // String --> Integer
        String s3 = "100";
        Integer in = Integer.valueOf(s3);
        System.out.println("in:" + in);
        // Integer --> String
        Integer in2 = 100;
        String s4 = String.valueOf(in2);
        System.out.println("s4:" + s4);
        // int --> Integer
        // 自动装箱
        Integer in3 = 500;
        int i2 = in3;
        System.out.println("i2:" + i2);
        // Integer --> int
        // 自动拆箱
        int i3 = 600;
        Integer integer = i3;
        System.out.println("integer:" + integer);
    }
}
