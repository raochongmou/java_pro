package rao;

import java.math.BigDecimal;

@SuppressWarnings({"all"})
public class TestDemo02 {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal(100000);
        BigDecimal bd2 = new BigDecimal(20000);
        // 加法运算
        BigDecimal bd3 = bd1.add(bd2);
        System.out.println("bd3:" + bd3);
        // 除法运算
        BigDecimal bd4 = bd2.divide(bd1);
        System.out.println("bd4:" + bd4);
        // 乘法预算
        BigDecimal bd5 = bd2.multiply(bd1);
        System.out.println("bd5:" + bd5);
        // 减法运算
        BigDecimal bd6 = bd1.subtract(bd2);
        System.out.println("bd6:" +bd6);
    }
}
