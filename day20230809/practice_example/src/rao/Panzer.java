package rao;

public class Panzer extends Weapon implements Moveable, Shootable{
    public void move() {
        System.out.println("坦克移动!");
    }
    public void shoot() {
        System.out.println("坦克开炮!");
    }
}
