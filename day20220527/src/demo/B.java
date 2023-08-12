package demo;

//final修饰的类无法被继承
//final修饰的方法无法被覆盖
//final声明的变量,一旦赋值,不可再次赋值
//public class B extends A {
//}
public class B {
    //成员变量之实例变量必须手动赋值,因为被final修饰的变量一经赋值,无法再次修改
    //第一种方案
    //final int a = 10;
    //第二种方法,创建构造方法赋值
    final int a;
    public B() {
        a = 10;
    }
    public static void main(String[] args) {
        final int i;
        i = 100;
        //i = 200;//报错，变量无法被分配值
    }
}
