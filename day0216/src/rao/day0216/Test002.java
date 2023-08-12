package rao.day0216;

public class Test002 {
    public static void main(String[] args) {
        //1到100之间的奇数之和
        int sum = 0;
        for(int i = 1; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println("1到100之间的奇数之和：" + sum);
    }
}
