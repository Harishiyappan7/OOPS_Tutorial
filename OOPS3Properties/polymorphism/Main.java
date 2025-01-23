package OOPS3Properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Shapes on = new Circle();
//        square.area();
//        shape.area();
//        circle.area();
        on.area();

    }
}
