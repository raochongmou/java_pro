package rao;

import java.util.Scanner;

@SuppressWarnings({"all"})
public class TestDemo02 {
    public static void main(String[] args) {
        System.out.println("欢迎使用季节查询系统");
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入一个季节:");
            String se = sc.next();
            switch (se) {
                case "Spring":
                    System.out.println("春天");
                    break;
                case "Summer":
                    System.out.println("夏天");
                    break;
                case "Autumn":
                    System.out.println("秋天");
                    break;
                case "Winter":
                    System.out.println("冬天");
                    break;
                default:
                    System.out.println("您输入季节的不存在!");
                    return;
            }
        }
    }
}
