package rao;

public class TestDemo07 {
    public static void main(String[] args) {
        UserServe us = new UserServe();
        try {
            us.register("rao", "12345");
        } catch(IllegalRegException e) {
            // e.printStackTrace();
            String msg = e.getMessage();
            System.out.println("msg:" + msg);
        }
    }
}
