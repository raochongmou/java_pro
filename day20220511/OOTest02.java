public class OOTest02 {
  public static void main(String[] args) {
    User u = new User();
    u.username = "张三丰";
    u.idCard = 420281;
    u.addr = new Address();
    u.addr.addrStreet = "桥口街";
    System.out.println(u.username);
    System.out.println(u.idCard);
    System.out.println(u.addr.addrStreet);
    System.out.println(u.username);
  }
}