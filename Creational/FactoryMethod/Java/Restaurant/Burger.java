package Creational.FactoryMethod.Java.Restaurant;

import java.util.ArrayList;

public class Burger {
    int productId;
    ArrayList<String> addons;

    public void prepare(){
        for (String s : this.addons){
            System.out.println("Adding " + s);
        }
        System.out.println("Finished");
    }

    public int getProductID(){
        return this.productId;
    }
}
