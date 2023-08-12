package rao.interfaces;

public class ClassExtendsImplements {
    public static void main(String[] args) {
        Bird c1 = new Cat1();
        c1.fly();
        Bird p1 = new Pig();
        p1.fly();
    }
}

class Animal {

}

interface Bird {
    void fly();
}

class Cat1 extends Animal implements Bird {
    public void fly() {
        System.out.println("我是一只会飞的猫!!!");
    }
}

class Pig extends Animal implements Bird {
    public void fly() {
        System.out.println("我是一直会飞的猪!!!");
    }
}