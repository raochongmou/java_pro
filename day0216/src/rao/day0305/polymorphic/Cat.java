package rao.day0305.polymorphic;

public class Cat extends Animal {
    public void move() {
        System.out.println("猫会走猫步!");
    }
    public void catchMouse() {
        System.out.println("猫会抓老鼠!");
    }
}
