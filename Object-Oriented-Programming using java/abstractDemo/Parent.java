package abhi.abstractDemo;

public abstract class Parent {
    int age;
    final int VALUE;
    public Parent(int age) {
        this.age = age;
        VALUE = 234343;
    }

    static void func(){
        System.out.println("Hello i am static method in Parent Class");
    }

    void normal(){
        System.out.println("Hey i am normal method in parent class");
    }

    // It doesn't have abstract static method coz abstract method should be overridden and static method should not overridden
//    abstract static void func();
    abstract void career();
    abstract void partner();
}
