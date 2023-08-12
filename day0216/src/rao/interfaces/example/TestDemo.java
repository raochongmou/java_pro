package rao.interfaces.example;

public class TestDemo {
    public static void main(String[] args) {
        FoodMenu china_cooker = new ChinaCooker();
        FoodMenu east_cooker = new EastCooker();
        Customer customer = new Customer(china_cooker);
        customer.order();
        Customer customer1 = new Customer(east_cooker);
        customer1.order();
    }
}
