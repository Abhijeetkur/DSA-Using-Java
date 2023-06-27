package abhi.Properties.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Circle circle = new Circle();
        Shapes triangle = new Triangle();
        Square square = new Square();
        Triangle.greeting(); // static methods can be inherit but it can't override
        square.area();

        System.out.println(circle instanceof  Shapes);
    }
}
