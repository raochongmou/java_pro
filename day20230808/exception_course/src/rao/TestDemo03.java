package rao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@SuppressWarnings({"all"})
public class TestDemo03 {
    public static void main(String[] args) {
        /**
         * 异常捕获的catch写多个时 必须从小到大编写
         **/
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\发布代码.txt");
            System.out.println("发布代码：" + fis.read());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
