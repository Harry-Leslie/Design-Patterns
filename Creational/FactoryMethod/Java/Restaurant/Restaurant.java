package Creational.FactoryMethod.Java.Restaurant;

public class Restaurant {

    public void getBurgers(){
        BeefBurgerFactory beefBurgerFactory = new BeefBurgerFactory();
        ChickenBurgerFactory chickenBurgerFactory = new ChickenBurgerFactory();
        VegBurgerFactory vegBurgerFactory = new VegBurgerFactory();

        Burger beefBurger = beefBurgerFactory.createBurger();
        Burger chickenBurger = chickenBurgerFactory.createBurger();
        Burger vegBurger = vegBurgerFactory.createBurger();
        beefBurger.prepare();
        chickenBurger.prepare();
        vegBurger.prepare();
    }

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.getBurgers();
    }
}
