package rao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDemo02 {
    public static void main(String[] args) {
        Date time = new Date(1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String s1 = sdf.format(time);
        System.out.println("s1:" + s1);
        Date time1 = new Date(System.currentTimeMillis() - 1000*60*60*24*365L);
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String l = sdf1.format(time1);
        System.out.println("l:" + l);
    }
}
