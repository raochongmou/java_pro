public class OOTest03 {
  public static void main(String[] args) {
    // 丈夫(对象)
    Husband zhangsan = new Husband();
    zhangsan.name = "张三";
    

    // 妻子(对象)
    Wife lisi = new Wife();
    lisi.name = "李四";
    lisi.h = zhangsan;
    zhangsan.w = lisi;
    // 公共访问对象属性
    System.out.println(lisi.name + "的丈夫名字叫作：" + lisi.h.name);
    System.out.println(zhangsan.name + "的妻子名字叫作：" + zhangsan.w.name);
  }
}