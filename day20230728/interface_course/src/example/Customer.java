package example;

public class Customer {
    // 顾客只需要面向菜单点菜  不需要和后厨建立关系
    private FoodMenus foodMenus;

    public Customer() {
    }

    public Customer(FoodMenus foodMenus) {
        this.foodMenus = foodMenus;
    }

    public FoodMenus getFoodMenus() {
        return foodMenus;
    }

    public void setFoodMenus(FoodMenus foodMenus) {
        this.foodMenus = foodMenus;
    }

    public void order() {
        foodMenus.yuXiangRouSi();
        foodMenus.xiHongShiChaoJiDan();
    }
}
