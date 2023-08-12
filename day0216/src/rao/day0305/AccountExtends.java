package rao.day0305;

public class AccountExtends {
    public static void main(String[] args) {
        CreditAccount ca = new CreditAccount();
        ca.setCredit(1000);
        ca.setBalance(500);
        ca.setAccNo("110");
        System.out.println("账号" + ca.getAccNo());
        System.out.println("信用分" + ca.getCredit());
        System.out.println("余额" + ca.getBalance());
    }
}
