package demo002;

public class TestDemo02 {
    public static void main(String[] args) {
        //向上转换(自动转换),子类向父类转换
        Animal c1 = new Cat();
        c1.move();
        //因为c1指向Animal引用类型,而Animal类型中不存在eat方法 所以找不到该方法
        //c1.eat();
        Animal b1 = new Bird();
        //向下转换(强制类型转换),父向子转换,编译可以通过,但是运行会报java.lang.ClassCastException(类型转换异常)
        //没有继承关系的两个类型不能进行强制类型转换
        //Cat c2 = (Cat)b1;
        //避免程序出异常,使用instanceof来判断一个引用是否是某个对象类型的实例
        if(b1 instanceof Bird) {
            Bird c2 = (Bird)b1;
            c2.eat();
        } else if(b1 instanceof Cat) {
            Cat b2 = (Cat)b1;
            b2.eat();
        }
    }
}
