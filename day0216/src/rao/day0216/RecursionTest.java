package rao.day0216;

public class RecursionTest {
    public static void main(String[] args) {
        int i = 4;
        U.log(sum(i));
    }
    public static int sum(int i) {
        if(i == 1) {
            return 1;
        }
        return i + sum(i-1);
    }
}
