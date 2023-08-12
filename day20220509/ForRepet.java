public class ForRepet {
  public static void main(String[] args) {
    // for1:for(int i=0; i<5; i++) {
    //   for2:for(int j=0; j<3; j++) {
    //     if(j == 2) {
    //       break for1;
    //     }
    //     System.out.println(j);
    //   }
    // }
    // 默认布尔变量为false
    int count = 0;
    for(int i=2; i<=100; i++) {
      boolean isPrimeNum = true;
      for(int j=2; j<i; j++) {
        if(i % j == 0) {
          isPrimeNum = false;
          break;
        }
      }
      if(isPrimeNum) {
        System.out.print(i + " ");
        ++count;
        if(count == 8) {
          System.out.println();
          count = 0;
        }
      }
    }

  }
}