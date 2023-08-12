package rao;

public class TestDemo02 {
    public static void main(String[] args) {
        // 多态
        MyMath mm = new MyMathImpl();
        int result1 = mm.sum(10, 20);
        int result2 = mm.sub(50, 8);
        System.out.println("result1: " + result1 + "\n" + "result2: " + result2);
    }
}

interface MyMath {
    public static final double PI = 3.1415926;
    public int sum(int i, int j);
    public int sub(int i, int j);
}

class MyMathImpl implements MyMath {
    public int sum(int i, int j) {
        return i + j;
    }
    public int sub(int i, int j) {
        return i - j;
    }
}
