package rao.day0306;

public class PackageTest {
    protected int i = 888;
    int j = 8;
    private int k = 88;
}

class A {
    public static void main(String[] args) {
        PackageTest pt = new PackageTest();
        System.out.println(pt.i);//protected 同包下可以访问
        System.out.println(pt.j);//缺省(default) 同包下可以访问
        //System.out.println(pt.k);//private 仅当前类中可以访问
    }
}
