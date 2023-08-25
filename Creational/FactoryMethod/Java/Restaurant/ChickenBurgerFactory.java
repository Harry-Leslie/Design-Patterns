package Creational.FactoryMethod.Java.Restaurant;

public class ChickenBurgerFactory implements IBurgerFactory {

    @Override
    public Burger createBurger() {
        return new ChickenBurger();
    }
    
}
