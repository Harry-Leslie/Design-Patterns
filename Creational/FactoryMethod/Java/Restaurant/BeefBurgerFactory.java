package Creational.FactoryMethod.Java.Restaurant;

public class BeefBurgerFactory implements IBurgerFactory {

    @Override
    public Burger createBurger() {
        return new BeefBurger();
    }
    
}
