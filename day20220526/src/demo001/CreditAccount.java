package demo001;

public class CreditAccount extends Account {
    private double credit;

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public CreditAccount() {
    }

    public CreditAccount(double credit) {
        this.credit = credit;
    }
}
