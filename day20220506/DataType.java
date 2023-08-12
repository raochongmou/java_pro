public class DataType {
  static char xx;
  public static void main(String[] args) {
    /* 
    数据类型(分为四大类 八小类)
    1.整数型
    byte/short/int/long
    2.浮点型
    float/double
    3.布尔型
    boolean
    4.字符型
    char
    --------------------------------
    基本数据类型           占用空间大小
    --------------------------------
    byte                     1
    short                    2
    int                      4
    long                     8
    float                    4
    double                   8
    boolean                  1
    char                     2  
    */
    // int x = 10;
    // int y = 010;
    // int z = 0X10;
    // System.out.println(x);
    // System.out.println(y);
    // System.out.println(z);
    // 整数型默认为int类型(-2147483647~2147483647);
    // long a = 2147483648;//int类型溢出
    long a = 2147483648L;
    int b = (int)a;
    System.out.print(b);
    // System.out.println(xx);
    // System.out.println("------------------------------------------");
    // System.out.println(xx + 1);
    // System.out.print("\u4e2d");
  }
}