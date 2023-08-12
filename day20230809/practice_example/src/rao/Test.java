package rao;

public class Test {
    public static void main(String[] args) {
        Army army = new Army(3);
        Fighter fighter = new Fighter();
        Panzer panzer = new Panzer();

        try {
            army.addWeapon(fighter);
            army.addWeapon(panzer);
            army.attackAll();
            army.moveAll();
        } catch (WeaponException e) {
            e.printStackTrace();
        }
    }
}
