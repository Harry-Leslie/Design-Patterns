package Structural.Bridge.Java.Shapes;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public void getShape() {
        System.out.println("This is a " + color.getColor() + " Square");
    }

    @Override
    public int getSides() {
        return 4;
    }
    
}
