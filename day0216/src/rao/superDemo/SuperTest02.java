package rao.superDemo;

public class SuperTest02 {
    public static void main(String[] args) {
        CreditAccout ca = new CreditAccout(0.98, 1000.0, "110");
        System.out.println("信用额度:" + ca.getCredit() + "\n\t" + "余额:" + ca.getBalance() + "\n\t" + "账号:" + ca.getAccNo());
    }
}

class Account {
    private String accNo;
    private double balance;

    public Account() {
    }

    public Account(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public String getAccNo() {
        return accNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class CreditAccout extends Account {
    private double credit;
    public CreditAccout() {}
    public CreditAccout(double credit, double balance, String accNo) {
        super(accNo, balance);
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}