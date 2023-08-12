public class MethodTest {
  public static void main(String[] args) {
    MethodTest.forRepet();
  }
  public static void forRepet() {
    int a;
    for(a=0; a<10; a++) {
      if(a == 5) {
        // break;
        return;
      }
      System.out.println(a);
    }
    System.out.println("hello world");
  }
}