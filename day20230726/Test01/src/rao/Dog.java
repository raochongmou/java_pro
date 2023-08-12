package rao;

public class Dog extends Pet{
    @Override
    public void eat() {
        System.out.println("狗在啃骨头!");
    }
    public void jump() {
        System.out.println("狗会跳高!");
    }
}
