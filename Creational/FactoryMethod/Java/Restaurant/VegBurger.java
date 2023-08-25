package Creational.FactoryMethod.Java.Restaurant;

public class VegBurger extends Burger{

    @Override
    public void prepare() {
        System.out.println("Veg Burger");
    }
    
}
