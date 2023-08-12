package rao.superDemo;

public class SuperTest03 {
    public static void main(String[] args) {
        Vip v = new Vip("张三");
        v.shopping();
        //v.doSome();
    }
}

class Custormer {
    String name;
    public Custormer() {}
    public Custormer(String name) {
        this.name = name;
    }
    public void doSome() {
        System.out.println(this.name);
        System.out.println("doSome");
    }
}

class Vip extends Custormer {
    public Vip() {}
    public Vip(String name) {
        super(name);
    }
    public void shopping() {
        System.out.println(this.name + "正在购物......");
        System.out.println(super.name + "正在购物......");
        super.doSome();
        System.out.println(name + "正在购物......");
    }
}