package rao.day0303;

public class DateTest {
    public static void main(String[] args) {
        Date d1 = new Date();
        d1.print();
        Date d2 = new Date(2008, 8, 8);
        d2.print();
    }
}

class Date {
    private int year;
    private int month;
    private int day;

    public Date() {
        //this.year = 1970;
        //this.month = 1;
        //this.day = 1;
        //这种方法不会创建新的构造对象，同时可以调用其他的构造方法
        this(1970, 1, 1);
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void print() {
        System.out.println(this.year + "年" + this.month + "月" + this.day + "日");
    }
}