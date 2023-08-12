package demo001;

public class Account {
    private String accno;
    private double balance;

    public Account(String accno, double balance) {
        this.accno = accno;
        this.balance = balance;
    }

    public Account() {
    }

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
