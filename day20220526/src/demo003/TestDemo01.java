package demo003;

public class TestDemo01 {
    public static void main(String[] args) {
        //多態的應用,將具體的事物抽象成類,低耦合,
        Master m = new Master();
        Snake s = new Snake();
        m.feed(s);
        Duck d = new Duck();
        m.feed(d);
        String newString = new String("abcccdddjhkhccddmf").replaceAll("c", "m");
        System.out.println(newString);
    }
}
