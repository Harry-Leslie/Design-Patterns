package Structural.Bridge.Java.Shapes;

public class Client {
    public static void main(String[] args) {
        Shape shape1 = new Square(new ColorRed());
        shape1.getShape();

        Shape shape2 = new Octagon(new ColorGreen());
        shape2.getShape();
    }
}
