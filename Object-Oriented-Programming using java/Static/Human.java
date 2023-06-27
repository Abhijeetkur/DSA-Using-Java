package abhi.Static;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;

//    long population; // this will give me individual population
    static long population; // this will give population that will be same for all

    static void message(){
        System.out.println("Hello World");
//        System.out.println(this.age); // we can't use this cause this belongs to an object
    }



    public Human (int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
//        this.population += 1; // this will give me individual population as well as same for static variable
        // but it is a good convention to use class name at the place of this

        Human.population += 1;

    }
}
