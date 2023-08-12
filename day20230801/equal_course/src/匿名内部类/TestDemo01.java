package 匿名内部类;

public class TestDemo01 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        // 使用匿名内部类，表示这个ComputedImpl这个类没名字了
        // 这里表面看上去好像是接口可以直接new了，实际上并不是接口可以new了
        // 后面的{}代表了对接口的实现
        // 不建议使用匿名内部类，为什么?
        // 因为一个没有名字，没有办法重复使用，另外代码太乱了，可读性太差。
        // int res = mm.mySum(new Computed() {
        //    public int sum(int i, int j) {
        //        return i + j;
        //    }
        // }, 200, 300);
        int res = mm.mySum(new ComputedImpl(), 20, 300);
        System.out.println(res);
    }
}
