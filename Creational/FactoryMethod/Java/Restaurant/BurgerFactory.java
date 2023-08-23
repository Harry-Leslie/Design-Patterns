package Creational.FactoryMethod.Java.Restaurant;

public class BurgerFactory {

    public Burger createBurger(String request){
        Burger burger = null;
        if ("BEEF".equals(request)){
            return new BeefBurger();
        } else if ("CHICKENBURGER".equals(request)){
            return new ChickenBurger();
        } else if ("VEGBURGER".equals(request)){
            return new VegBurger();
        }
        return burger;
    }
}
