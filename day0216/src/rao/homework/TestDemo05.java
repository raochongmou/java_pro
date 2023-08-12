package rao.homework;

public class TestDemo05 {
    public static void main(String[] args) {
        MyTime mt1 = new MyTime(14, 6, 40);
        mt1.display();
        mt1.addHour(38);
        mt1.display();
        mt1.addMinute(121);
        mt1.display();
        mt1.addSecond(121);
        mt1.display();
    }
}

class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {

    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void display() {
        System.out.println(this.getHour() + "时" + this.getMinute() + "分" + this.getSecond() + "秒");
    }

    public int getHour() {
//        if(hour > 23) {
//            hour = hour - 24;
//        }
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
//        if(second > 59) {
//            second = second - 60;
//        }
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    //加时
    public void addHour(int hour) {
        if(hour + getHour() > 23) {
            setHour((hour + getHour()) % 24);
            return;
        }
        setHour(hour + getHour());
    }
    //加分
    public void addMinute(int minute) {
        if(minute + getMinute() == 60) {
            setMinute(0);
            setHour(1 + getHour());
            return;
        } else if(minute + getMinute() > 60) {
            setMinute((minute + getMinute()) % 60);
            setHour(getHour() + (minute + getMinute()) / 60);
        } else {
            setMinute(minute + getMinute());
        }
    }
    //加秒
    public void addSecond(int second) {
        if(second + getSecond() == 60) {
            setSecond(0);
            setMinute(1 + getMinute());
            return;
        } else if(second + getSecond() > 60) {
            setSecond((second + getSecond()) % 60);
            setMinute(getMinute() + (second + getSecond()) / 60);
        } else {
            setSecond(second + getSecond());
        }
    }
    //减时
    public void subHour(int hour) {}
    //减分
    public void subMinute(int minute) {}
    //减秒
    public void subSecond(int second) {}
}