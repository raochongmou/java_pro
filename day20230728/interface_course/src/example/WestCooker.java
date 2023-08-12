package example;

public class WestCooker implements FoodMenus{
    @Override
    public void yuXiangRouSi() {
        System.out.println("西方厨师做的鱼香肉丝!");
    }

    @Override
    public void xiHongShiChaoJiDan() {
        System.out.println("西方厨师做的西红柿炒鸡蛋!");
    }
}
