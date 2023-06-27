package abhi.Properties.Polymorphism;

public class Triangle extends Shapes{
    @Override // this shows that a method is overridden or not and it is known as annotation
    void area(){
        System.out.println("Area is 0.5 * b * h");
    }

    static void greeting(){
        System.out.println("Hi, I am in Triangle!!");
    }
}
