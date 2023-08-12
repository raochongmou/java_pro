package rao.day0216;

public class WhileTest {
    public static void main(String[] args) {
//        int i = 10;
//        int j = 20;
//        while(i<j) {
//            System.out.println("我是一个冰");
//        }
//        System.out.println("我不会运行");
//        int i = 10;
//        while(i>=0) {
//            System.out.println("i" + i);//10.9.8.7.6.5.4.3.2.1.0
//            i--;
//        }
        //先斩后奏，上来直接输出10
        int i = 10;
        do{
            System.out.println("i========>"+i);
        } while(i>10);
        //不走该循环体内容，没有任何输出
        while(i>10) {
            System.out.println("i========>"+i);
        }
    }
}
