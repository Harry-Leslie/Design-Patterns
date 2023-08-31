package Structural.Bridge.Java.Shapes;

public class Octagon extends Shape {

    public Octagon(Color color) {
        super(color);
    }

    @Override
    public void getShape() {
        System.out.println("This is a " + color.getColor() + " Octagon");
    }

    @Override
    public int getSides() {
        return 8;
    }
    
}
