package Creational.FactoryMethod.Java.Restaurant;

public class Restaurant {

    public Burger getBurger(String request){
        Burger burger = new BurgerFactory().createBurger(request);
        burger.prepare();
        return burger;
    }
    
}
