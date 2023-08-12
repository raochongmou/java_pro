package rao;

import java.util.Objects;

public class TestDemo01 {
    public static void main(String[] args) {
        MyTime mt1 = new MyTime(2023, 7, 31);
        System.out.println(mt1);
        MyTime mt2 = new MyTime(2013, 7, 31);
        System.out.println(mt1.equals(mt2));
    }
}

class MyTime {
    int year;
    int month;
    int day;

    public MyTime() {
    }

    public MyTime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyTime{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof MyTime)) return false;
        MyTime myTime = (MyTime) o;
        return year == myTime.year && month == myTime.month && day == myTime.day;
    }
}
