package rao;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack ms = new MyStack();
        try {
            ms.push(1);
            ms.push(1);
            ms.push(1);
            ms.push(1);
            ms.push(1);
            ms.push(1);
            ms.push(1);
            ms.push(1);
            ms.push(1);
            ms.push(1);
            ms.push(new Object());
        } catch (MyStackException e) {
            String msg = e.getMessage();
            System.out.println("msg:" + msg);
        }
        try {
            ms.pop();
            ms.pop();
            ms.pop();
            ms.pop();
            ms.pop();
            ms.pop();
            ms.pop();
            ms.pop();
            ms.pop();
            ms.pop();
            ms.pop();
        } catch (MyStackException e) {
            String msg = e.getMessage();
            System.out.println("msg:" + msg);
        }

    }
}
