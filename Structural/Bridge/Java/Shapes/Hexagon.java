package Structural.Bridge.Java.Shapes;

public class Hexagon extends Shape {

    public Hexagon(Color color) {
        super(color);
    }

    @Override
    public void getShape() {
        System.out.println("This is a " + color.getColor() + " Hexagon");
    }

    @Override
    public int getSides() {
        return 6;
    }
    
}
