package rao;

@SuppressWarnings({"all"})
public class Army {
    private Weapon[] weapons;
    public Army(int count) {
        weapons = new Weapon[count];
    }
    public void addWeapon(Weapon weapon) throws WeaponException {
        for(int i = 0; i < weapons.length; i++) {
            if(null == weapons[i]) {
                weapons[i] = weapon;
                return;
            }
        }
        throw new WeaponException("武器容器已满!");
    }
    public void attackAll() {
        for(int i = 0; i < weapons.length; i++) {
            if(weapons[i] instanceof Shootable) {
                /**
                 * 类在强制类型转换的过程中，如果是类转换成接口类型。
                 * 那么类和接口之间不需要存在继承关系，也可以转换，
                 * java语法中允许
                 */
                Shootable shootable = (Shootable) weapons[i];
                shootable.shoot();
            }
        }
    }
    public void moveAll() {
        for(int i = 0; i < weapons.length; i++) {
            if(weapons[i] instanceof Moveable) {
                /**
                 * 类在强制类型转换的过程中，如果是类转换成接口类型。
                 * 那么类和接口之间不需要存在继承关系，也可以转换，
                 * java语法中允许
                 */
                Moveable moveable = (Moveable) weapons[i];
                moveable.move();
            }
        }
    }
}
