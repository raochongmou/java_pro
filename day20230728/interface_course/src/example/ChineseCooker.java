package example;

public class ChineseCooker implements FoodMenus{
    @Override
    public void yuXiangRouSi() {
        System.out.println("中国厨师做的鱼香肉丝!");
    }

    @Override
    public void xiHongShiChaoJiDan() {
        System.out.println("中国厨师做的西红柿炒鸡蛋!");
    }
}
