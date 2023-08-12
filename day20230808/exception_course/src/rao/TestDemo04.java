package rao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@SuppressWarnings({"all"})
public class TestDemo04 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\发布代码.txt");
            String s = null;
            // 空指针异常
            s.toString();
        } catch(FileNotFoundException | NullPointerException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        int res = getResult();
        System.out.println(res);
    }
    // 程序遵循自上而下的顺序执行，所以直接返回的是100
    public static int getResult() {
        int i = 100;
        try {
            return i;
        } finally {
            i++;
        }
    }
}
