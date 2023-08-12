package rao;

@SuppressWarnings({"all"})
public class TestDemo01 {
    public static void main(String[] args) throws ArithmeticException {
        // try {
            doSome();
        // } catch (Exception err) {
        //     System.out.println("err" + err);
        // }
    }
    public static void doSome() throws ArithmeticException {
        int i = 10;
        int j = 0;
        System.out.println(i / j);
        System.out.println("hello");
    }
}
