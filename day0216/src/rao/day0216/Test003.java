package rao.day0216;

public class Test003 {
    public static void main(String[] args) {
        //九九乘法表
//        for(int i = 1; i <= 9; i++) {
//            for(int j = 1; j <= i; j++) {
//                if(i == j) System.out.println(i + " * " + j + " = " + i*j);
//                else System.out.print(i + " * " + j + " = " + i*j + "\t");
//            }
//        }
//        for(int i = 1; i <= 9; i++) {
//            for(int j = 1; j <= i; j++) {
//                System.out.print(i + " * " + j + " = " + i*j + "\t");
//            }
//            System.out.println("");
//        }
        //求2-100之间的素数,能被1和本身整除，不能被其他数整除的数成为素数（质素）
        //分析：7是不是一个素数
        //7/1   不用考查1
        //7/2===>7%2===>不为0
        //7/3===>7%3===>不为0
        //7/4===>7%4===>不为0
        //7/5===>7%5===>不为0
        //7/6===>7%6===>不为0
        //7/7    不用考查
//        int i = 7;
//        Boolean isPrimeNumber = true;
//        for(int j = 2; j < i; j++) {
//            if(i%j == 0) {
//                isPrimeNumber = false;
//            }
//        }
//        System.out.println(isPrimeNumber ? i + "是素数" : i + "不是素数");
        int a = 1;
        for (int j = 3; j <= 10000; j++) {
            boolean isPrimeNumber = true;
            for (int i = 3; i < j; i++) {
                if (j % i == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                if(a%8 == 0) {
                    System.out.println(j);
                } else {
                    System.out.print(j + " ");
                }
                a++;
            }
        }
    }
}
