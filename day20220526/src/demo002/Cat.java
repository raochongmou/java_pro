package demo002;

public class Cat extends Animal{
    @Override
    public void move() {
        System.out.println("猫会走猫步");
    }
    //猫独有的方法
    public void eat() {
        System.out.println("小猫爱吃鱼");
    }
}
