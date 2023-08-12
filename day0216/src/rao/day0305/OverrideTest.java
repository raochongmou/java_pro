package rao.day0305;

public class OverrideTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.move();
        Fish f = new Fish();
        f.move();
        Bird b = new Bird();
        b.move();
        Parrot p = new Parrot();
        p.move();
    }
}
