package Creational.FactoryMethod.Java.Restaurant;

import java.util.ArrayList;

public abstract class Burger {
    int productId;
    ArrayList<String> addons;

    public abstract void prepare();

    public int getProductID(){
        return this.productId;
    }
}
