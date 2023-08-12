package demo001;

public class Extends {
    //所有类都继承java.lang.object
    public static void main(String[] args) {
//        Extends et = new Extends();
//        String s = et.toString();
//        System.out.println(s);//demo001.Extends@2d98a335
        CreditAccount ca = new CreditAccount();
        ca.setBalance(100.0);
        ca.setCredit(10000.0);
        ca.setAccno("110110");
        System.out.println(ca.getAccno());
        System.out.println(ca.getCredit());
        System.out.println(ca.getBalance());
    }
}
