package rao.day0303;

public class ConstructTest {
    public static void main(String[] args) {
        Count c1 = new Count();
        System.out.println("账户" + c1.getCountId());
        System.out.println("余额" + c1.getAmount());
        Count c2 = new Count("110");
        System.out.println("账户" + c2.getCountId());
        System.out.println("余额" + c2.getAmount());
        Count c3 = new Count("998", 99.00);
        System.out.println("账户" + c3.getCountId());
        System.out.println("余额" + c3.getAmount());
        int c = sum(10, 20);
        System.out.println("c" + c);
        ConstructTest con = new ConstructTest();
        int f = con.sub(50, 2);
        System.out.println("f" + f);
    }

    /**
     * 静态方法
     * @param a 加数
     * @param b 加数
     * @return
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * 实例方法
     * @param a 减数
     * @param b 被减数
     * @return
     */
    public int sub(int a, int b) {
        return a - b;
    }

}
