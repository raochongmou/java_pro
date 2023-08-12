package rao;

public class Fighter extends Weapon implements Shootable, Moveable{
    public void move() {
        System.out.println("飞机起飞!");
    }
    public void shoot() {
        System.out.println("飞机开火!");
    }
}
