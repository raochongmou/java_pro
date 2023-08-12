package rao.day0305;

public class Account {
    private String accNo;
    private int balance;

    public Account() {
    }

    public Account(String accNo, int balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public String getAccNo() {
        return accNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
