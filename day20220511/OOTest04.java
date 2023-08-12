public class OOTest04 {
  public static void main(String[] args) {
    Customer c = new Customer();
    c.id = 120;
    System.out.println(c.id);
    // c = null;
    // Exception in thread "main" java.lang.NullPointerException: Cannot read field "id" because "<local1>" is null
    //     at OOTest04.main(OOTest04.java:7)
    // System.out.println(c.id);
  }
}