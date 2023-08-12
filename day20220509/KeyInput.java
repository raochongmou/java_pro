public class KeyInput {
  public static void main(String[] args) {
    // 创建键盘扫描器对象
    // java.util.Scanner s = new java.util.Scanner(System.in);
    // 调用scanner对象的next()方法开始接收用户键盘输入的值
    // 接收文本，以字符串的形式接收
    // String userInputContent = s.next();
    // 接收整数型
    // int num = s.nextInt();
    // System.out.print("您输入的是" + (num + 500));
    // switch用法
    // java.util.Scanner s = new java.util.Scanner(System.in);
    // System.out.print("请输入数字:");
    // short sot = (short)s.nextInt();
    // switch(sot) {
    //   case 1:
    //   System.out.println("星期一");
    //   break;
    //   case 2:
    //   System.out.println("星期二");
    //   break;
    //   case 3:
    //   System.out.println("星期三");
    //   break;
    //   case 4:
    //   System.out.println("星期四");
    //   break;
    //   case 5:
    //   System.out.println("星期五");
    //   break;
    //   case 6:
    //   System.out.println("星期六");
    //   break;
    //   case 7:
    //   System.out.println("星期日");
    //   break;
    //   default:
    //   System.out.println("您输入的不正确!");
    //   break;
    // }
    // int y;
    // y = 10;
    // System.out.println(y);
    // int i = 10;
    // int j = 3;
    // while(10 > 3) {
    //   System.out.println("死循环");
    // }
    // System.out.println("循环体外");
    int k = 10;
    do{
      System.out.println("k====>"+ k);
      k--;
    } while(k > 0);
  }
}