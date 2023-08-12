package example;

public class Test {
    public static void main(String[] args) {
        FoodMenus foodMenus = new WestCooker();
        // FoodMenus foodMenus = new ChineseCooker();
        Customer c = new Customer(foodMenus);
        c.order();
    }
}
