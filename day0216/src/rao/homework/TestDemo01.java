package rao.homework;

import java.util.Scanner;


/**
 * 快捷键
 * ctrl + Y 删除一行
 * ctrl + shift + f12 菜单折叠/展开
 * ctrl + shift + f10 快速运行项目
 */
public class TestDemo01 {
    /**猜数字游戏
     * 一个类A有一个实例变量v,从键盘接收一个正整数作为实例变量v的初始值
     * 另外再定义一个类B,对A类的实例变量v进行猜测。
     * 如果大了则提示大了
     * 如果小了则提示小了
     * 等于则提示猜测成功
     */
    public static void main(String[] args) {
        A a = new A(100);
        B b = new B(a);
        while (true) {
            System.out.print("请输入您要猜的数字: ");
            java.util.Scanner s = new Scanner(System.in);
            int caicezhi = s.nextInt();
            b.caiCe(caicezhi);
        }
    }
}

class A {
    private int v;
    public A() {}
    public A(int v) {
        this.v = v;
    }
    public void setV(int v) {
        this.v = v;
    }
    public int getV() {
        return v;
    }
}

class B {
    private A a;
    public B() {}
    public B(A a) {
        this.a = a;
    }
    public void caiCe(int caiCeZhi) {
        int shijizhi = a.getV();
        if(caiCeZhi > shijizhi) {
            System.out.println("猜大了!");
        } else if(caiCeZhi == shijizhi) {
            System.out.println("猜对了!");
            System.exit(0);//退出虚拟机
        } else {
            System.out.println("猜小了!");
        }
    }
}