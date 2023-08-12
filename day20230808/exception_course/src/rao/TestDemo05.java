package rao;

public class TestDemo05 {
    public static void main(String[] args) {
        MyException me = new MyException("自定义异常错误!");
        String msg = me.getMessage();
        System.out.println("msg:" + msg);
    }
}
// 自定义异常类
class MyException extends Exception {
    public MyException() {}
    public MyException(String s) {
        super(s);
    }
}
