package rao.day0216;

public class BreakTest {
    public static void main(String[] args) {
//        for(int i = 0; i < 10; i++) {
//            if(i == 5) {
//                break;
//            }
//            System.out.println("i=======>"+i);
//        }
        A:for(int i = 0; i < 3; i++) {
            B:for(int j = 0; j < 10; j++) {
                if(j == 5) {
                    break A;
                }
                System.out.println("i=========>"+j);
            }
        }
        C:for(int i = 0; i < 10; i++) {
            if(i == 5) {
                continue C;
            }
            System.out.println("i========>"+i);
        }
    }
}
