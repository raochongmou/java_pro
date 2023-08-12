package rao.day0305;

public class Test01 {
    //有static的方法
    public static void method1() {
        //调用doSome
        //完整方式调用
        Test01.doSome();
        //省略方式调用
        doSome();

        //调用doOther
        //完整方式调用
        Test01 t4 = new Test01();
        t4.doOther();
        //省略方式调用

        //访问i
        //完整方式访问
        Test01 t5 = new Test01();
        System.out.println("i" + t5.i);
        //省略方式访问
        //不可省略

        System.out.println("method1!");
    }
    //没有static的方法
    public void method2() {
        //调用doSome
        //完整方式调用
        Test01.doSome();
        //省略方式调用
        this.doSome();

        //调用doOther
        //完整方式调用
        Test01 t2 = new Test01();
        t2.doOther();
        this.doOther();
        //省略方式调用
        doOther();

        //访问i
        //完整方式访问
        Test01 t3 = new Test01();
        System.out.println("i" + t3.i);
        //省略方式访问
        //不可省略调用

        System.out.println("method2!");
    }
    public static void main(String[] args) {
        //调用method1
        //使用完整的方式调用
        Test01.method1();
        //使用省略的方式调用
        method1();
        //调用method2
        //使用完整的方式调用
        Test01 t1 = new Test01();
        t1.method2();
        //使用省略的方式调用
        //引用方式无法省略调用
    }
    //没有static的变量
    int i = 10;
    //有static的方法
    public static void doSome() {
        System.out.println("do some!");
    }
    //没有static的方法
    public void doOther() {
        System.out.println("do other!");
    }
}
