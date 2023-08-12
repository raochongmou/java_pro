package rao;

@SuppressWarnings({"all"})
public class TestDemo01 {
    public static void main(String[] args) {
        System.out.println(new String("aaa") == new String("aaa"));
        byte[] bytes = {97, 98, 99};
        String s1 = new String(bytes);
        System.out.println("s1:" + s1);
        String s2 = new String(bytes, 1, 2);
        System.out.println("s2:" + s2);
        char[] chars = {'我', '是', '中', '国', '人'};
        String s3 = new String(chars);
        System.out.println("s3:" + s3);
        String s4 = new String(chars, 2, 3);
        System.out.println("s4:" + s4);

        char c1 = "中国人".charAt(1);
        System.out.println("c1:" + c1);
        System.out.println("abcd".compareTo("abcd"));
        System.out.println("abcd".compareTo("abce"));
        System.out.println("abce".compareTo("abcd"));
        // 包含
        System.out.println("hellow world".contains("hellow"));

        StringBuffer sb = new StringBuffer();
    }
}
