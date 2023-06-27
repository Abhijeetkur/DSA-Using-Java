package abhi.Static;

public class Main {
    public static void main(String[] args) {
//        Human abhijeet = new Human(22, "Abhijeet", 12900, false);
//        Human prince = new Human(20, "Prince", 15000, true);
//
//        System.out.println(Human.population);
//        System.out.println(Human.population);

//        greeting(); // It will not work cause inside static we can't use non static thing

        Main funn = new Main();
        funn.fun2();
    }

    static void fun(){

        // you can't use this because it requires an instance
        // but the function you are using it in does not depend on instances
//        greeting(); // It will not work cause inside static we can't use non static thing

        // you cannot access non static stuff without refrencing their instance in
        // a static context

        // hence, here we are referencing it
        Main obj = new Main();
        obj.greeting();
    }

    void fun2(){
        greeting();
    }

    // we know that something that is not static, belongs to an object
    void greeting() {
        System.out.println("Hello World");
    }
}
