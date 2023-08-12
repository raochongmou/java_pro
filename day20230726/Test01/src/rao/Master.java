package rao;

public class Master {
    public void feed(Pet p) {
        p.eat();
        if(p instanceof Cat) {
            Cat c1 = (Cat) p;
            c1.catchMouse();
        }
        // 多态 父类型引用指向子类型对象这种机制导致编译阶段绑定和运行阶段绑定的两种不同状态，这种机制可以称为一种多态语法机制
        if(p instanceof Dog) {
            Dog d1 = (Dog) p;
            d1.jump();
        }
    }
}
