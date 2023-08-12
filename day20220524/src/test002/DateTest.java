package test002;

public class DateTest {
    private int year;
    private int month;
    private int date;

    public DateTest() {
        // this.year = 1970;
        // this.month = 1;
        // this.date = 1;
        this(1970, 1, 1);
    }

    public DateTest(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    //打印年月日日期的方法
    public void print() {
        System.out.println(this.year + "年" + this.month + "月" + this.date + "日");
    }
}
