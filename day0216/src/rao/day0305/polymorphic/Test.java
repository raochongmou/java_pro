package rao.day0305.polymorphic;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.move();
        Bird b = new Bird();
        b.move();
        Cat c = new Cat();
        c.catchMouse();
        c.move();

        //多态
        //Animal a2 = new Cat();
        //a2.move();
        Cat a2 = (Cat) new Cat();
        a2.catchMouse();
        /**
         * 1.以下程序编译是没有问题的，因为编译器检查到a3的数据类型是Animal
         * Animal和Cat之间存在继承关系,并且Animal是父类型,Cat是子类,
         * 父类型转化成子类型叫作向下转型,语法合格.
         * 2.程序虽然编译通过了,但是程序在运行阶段会出现问题
         * java.lang.ClassCastException
         */
        Animal a3 = new Bird();
        if(a3 instanceof Cat) {
            Cat c2 = (Cat) a3;
            c2.catchMouse();
        } else if(a3 instanceof Bird) {
            Bird b2 = (Bird) a3;
            b2.catchInsect();
        }
    }
}
