package rao;

// 去除警告
@SuppressWarnings({"all"})
public class TestDemo02 {
    public static void main(String[] args) {
        Animal[] various = new Animal[]{new Cat(), new Bird()};
        for (int i = 0; i < various.length; i++) {
            // 向下转型 需要判断该实例是不是该对象的实例
            if(various[i] instanceof Cat) {
                Cat c = (Cat) various[i];
                c.catchMouse();
            } else if(various[i] instanceof Bird) {
                Bird b = (Bird) various[i];
                b.sing();
            }
        }
    }
}

class Animal {
    public void move() {
        System.out.println("动物在移动!");
    }
}

class Cat extends Animal {
    @Override
    public void move() {
        System.out.println("猫在走猫步!");
    }
    public void catchMouse() {
        System.out.println("猫抓老鼠!");
    }
}

class Bird extends Animal {
    @Override
    public void move() {
        System.out.println("鸟在飞翔!");
    }
    public void sing() {
        System.out.println("鸟儿在吟唱!");
    }
}
