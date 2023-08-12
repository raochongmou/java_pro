public class Recursion {
  public static void main(String[] args) {
    int n = 10;
    int result = sum(n);
    U.p(result);
  }
  public static int sum(int n) {
    // if(n > 0) {
    //   n--;
    // }
    if(n > 1) {
      return n + sum(n-1);
    }
    return 1;
  }
}