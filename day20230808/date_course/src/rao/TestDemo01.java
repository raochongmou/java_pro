package rao;

public class TestDemo01 {
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        print();
        long t2 = System.currentTimeMillis();
        System.out.println("打印[0-10000)共耗时为:" + (t2 - t1) + "ms");
    }
    public static void print() {
        for(int i = 0; i < 100000; i++) {
            System.out.println(i);
        }
    }
}
