package demo002;

public class Animal {
    //私有方法不能继承,所以不能覆盖
    //private void move(){}
    //构造方法不能继承,所以不能覆盖
    //public Animal() {}
    //覆盖只针对方法,属性不存在覆盖
    public void move() {
        System.out.println("动物正在移动");
    }
}
