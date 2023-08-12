package rao.day0216;

public class ReturnTest {
    public static void main(String[] args) {
        m();
    }
    public static void m() {
        for (int i = 0; i < 10; i++) {
            if(i == 5) {
                System.out.println("i=====>"+i);
                //return;//终止m方法
                break;//终止当前循环体
            }
        }
        System.out.println("m is executed in class ReturnTest");
    }
}
