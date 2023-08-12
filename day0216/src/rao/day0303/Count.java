package rao.day0303;

public class Count {
    private String countId;
    private double amount;
    /**
     * 构造函数
     *
     * */
    public Count() {
    }

    public Count(String countId) {
        this.countId = countId;
    }

    public Count(double amount) {
        this.amount = amount;
    }

    public Count(String countId, double amount) {
        this.countId = countId;
        this.amount = amount;
    }

    public String getCountId() {
        return countId;
    }

    public void setCountId(String countId) {
        this.countId = countId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
