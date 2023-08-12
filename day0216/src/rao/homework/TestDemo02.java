package rao.homework;

public class TestDemo02 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.setSize(5);
        v.setSpeed(120);
        System.out.println("speed: " + v.getSpeed());
        Vehicle v2 = new Vehicle(110, 10);
        System.out.println("speed2: " + v2.getSpeed());
        v2.speedUp(10);
        System.out.println("speed3: " + v2.getSpeed());
        v2.speedDown(30);
        System.out.println("speed4: " + v2.getSpeed());
    }
}

class Vehicle {
    private int speed;//速度
    private int size;//体积

    public Vehicle() {
    }

    public Vehicle(int speed, int size) {
        this.speed = speed;
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void move() {}

    public void speedUp(int addSpeed) {
        this.setSpeed(this.getSpeed() + addSpeed);
    }

    public void speedDown(int subSpeed) {
        this.setSpeed(this.getSpeed() - subSpeed);
    }
}