package abhi.generics;

public class Main implements GenericInterface<Integer>{


    @Override
    public void display(Integer value) {
        System.out.println("I am in main class and implements Generic Interface");
    }
}
