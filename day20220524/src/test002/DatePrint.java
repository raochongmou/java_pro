package test002;

public class DatePrint {
    public static void main(String[] args) {
        DateTest d = new DateTest();
        d.print();
        DateTest d1 = new DateTest(2022, 5, 24);
        d1.print();
    }
}
