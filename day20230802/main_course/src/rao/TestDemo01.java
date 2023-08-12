package rao;

public class TestDemo01 {
    public static void main(String[] args) {
        String args1 = args[0];
        String args2 = args[1];
        if("admin".equals(args1) && "123".equals(args2)) {
            System.out.println("欢迎进入安卓系统!");
        } else {
            System.out.println("你输入的用户名或密码不正确,请重试!");
        }
    }
}
