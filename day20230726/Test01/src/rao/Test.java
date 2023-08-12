package rao;

public class Test {
    public static void main(String[] args) {
        Master m = new Master();
        Pet p1 = new Dog();
        m.feed(p1);
        Pet p2 = new Cat();
        m.feed(p2);
    }
}
