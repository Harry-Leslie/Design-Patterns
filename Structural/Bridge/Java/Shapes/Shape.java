package Structural.Bridge.Java.Shapes;

public abstract class Shape {
    Color color;
    public Shape(Color color){
        this.color = color;
    }
    public abstract void getShape();
    public abstract int getSides();
}
