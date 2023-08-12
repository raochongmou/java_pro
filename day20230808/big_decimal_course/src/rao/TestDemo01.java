package rao;

import javax.swing.text.NumberFormatter;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.logging.SimpleFormatter;

public class TestDemo01 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###, ###.0000");
        String str = df.format(1234.12);
        System.out.println("str:" + str);
    }
}
