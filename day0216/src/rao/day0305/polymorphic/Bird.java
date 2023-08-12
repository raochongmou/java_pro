package rao.day0305.polymorphic;

public class Bird extends Animal {
    public void move() {
        System.out.println("鸟儿在飞行!");
    }

    public void catchInsect() {
        System.out.println("鸟儿会抓虫子!");
    }
}
