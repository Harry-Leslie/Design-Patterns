package Creational.FactoryMethod.Java.Restaurant;

public class VegBurgerFactory implements IBurgerFactory{

    @Override
    public Burger createBurger() {
        return new VegBurger();
    }
    
}
