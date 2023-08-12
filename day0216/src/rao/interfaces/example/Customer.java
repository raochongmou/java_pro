package rao.interfaces.example;

public class Customer {
    private FoodMenu food_menu;

    public Customer() {
    }

    public Customer(FoodMenu food_menu) {
        this.food_menu = food_menu;
    }

    public FoodMenu getFood_menu() {
        return food_menu;
    }

    public void setFood_menu(FoodMenu food_menu) {
        this.food_menu = food_menu;
    }
    public void order() {
        food_menu.fanqiejidan();
        food_menu.yuxiangrousi();
    }
}
