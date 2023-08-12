public class OverLoad {
  public static void main(String[] args) {
    // System.out.println(sum(1, 2));
    // System.out.println(sum(1.0, 2.0));
    // System.out.println(sum(1L, 2L));
    U.p(sum(1, 2));
    U.p("aaa");
  }
  // 方法重载机制,方法名相同, 实现功能相似, 逻辑相似
  // 满足方法重载的条件
  //   - 在同一个类体当中
  //   - 方法名相同
  //     - 形参数量不同
  //     - 形参顺序不同
  //     - 形参类型不同
  // 方法重载与修饰符列表无关
  // void y(){}
  // public static void y(){}
  // 方法重载与形参变量名无关
  // public static void m(int a, int b) {}
  // public static void m(int b, int a) {}
  // 方法重载与返回值类型无关  错误原因: 已经在类体中定义过方法c
  // public static void c(int c) {}
  // public static int c(int c) {
  //   return c;
  // }
  public static int sum(int x, int y) {
    return x + y;
  }
  public static double sum(double x, double y) {
    return x + y;
  }
  public static long sum(long x, long y) {
    return x + y;
  }
}