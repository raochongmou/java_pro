package rao.superDemo;

public class SuperTest04 {
    /**
     * 当子类父类方法相同时 如果要在子类其他方法内部调用父类的同名方法,
     * super.必不能省略,其访问属性也是如此
     * super.属性名 访问父类的属性
     * super.方法名() 访问父类的方法
     * super() 访问父类的构造函数
     * @param args
     */
    public static void main(String[] args) {
        Cat c = new Cat();
        c.yiDong();
    }
}

class Animal {
    public void move() {
        System.out.println("Animal move!");
    }
}

class Cat extends Animal {
    public void move() {
        System.out.println("Cat move!");
    }
    public void yiDong() {
        this.move();
        move();
        super.move();
    }
}