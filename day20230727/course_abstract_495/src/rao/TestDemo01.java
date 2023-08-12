package rao;

/*
 * 抽象类中可以没有抽象方法， 抽象方法一定出现在抽象类中
 * 抽象类中如果有抽象方法，那么继承他的子类必须实现/覆盖这个抽象方法
 * 抽象方法abstract不能和final关键字联用
 * 抽象类中有构造方法供子类使用
 * */
public class TestDemo01 {
    public static void main(String[] args) {
        // 面向抽象编程
        Animal animal = new Cat(10);
        System.out.println(animal.age);
        animal.move();
    }
}
abstract class Animal {
    int age;
    public Animal() {
        System.out.println("程序走了这里!");
    }
    public Animal(int age) {
        this.age = age;
        System.out.println("程序1111");
    }
    public abstract void move();
}
class Cat extends Animal {
    int age;
    public void move() {
        System.out.println("猫在走猫步!");
    }
    public Cat(int age) {
//        super(age);
    }
}
