package rao;

public class TestDemo01 {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        Result r = divide(10, 0);
        System.out.println(r);
    }
    public static Result divide(int i, int j) {
        try{
            int c = i / j;
            return Result.SUCCESS;
        } catch(Exception err) {
            return Result.FAIL;
        }
    }
    enum Result {
        SUCCESS,
        FAIL
    }
}
