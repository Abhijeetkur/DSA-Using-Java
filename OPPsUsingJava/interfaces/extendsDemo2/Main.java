package abhi.interfaces.extendsDemo2;

public class Main implements A, B {
    @Override
    public void greet() {

    }

    // It will give error coz A and B have same default methods
}
