package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) throws Exception {
        Date nowTime = new Date();
        System.out.println("nowTime:" + nowTime);
        SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String nowTimeStr = simple.format(nowTime);
        System.out.println("nowTimeStr: " + nowTimeStr);
        // String类型转换成Date类型
        String str = "2008-08-08 08:08:08 888";
        Date dateStr = simple.parse(str);
        System.out.println("dateStr:" + dateStr);
    }
}
