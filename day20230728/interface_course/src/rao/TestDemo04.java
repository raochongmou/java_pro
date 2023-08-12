package rao;

public class TestDemo04 {
    public static void main(String[] args) {
        Flyable f = new Cat();
        f.fly();
        Animal a = new Cat();
        a.fly();
    }
}

interface Flyable {
    void fly();
}

class Animal {
    public void fly() {
        System.out.println("我是一只普通的猫!");
    }
}

class Cat extends Animal implements Flyable {
    public void fly() {
        System.out.println("我是一只猫头鹰!");
    }
}
