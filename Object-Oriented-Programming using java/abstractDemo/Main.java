package abhi.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(26);
        son.career();
        int value = son.VALUE;
        System.out.println(value);

        Daughter daughter = new Daughter(20);
        daughter.career();
        daughter.partner();
        Son.func();
        
        Parent.func();
        Parent parent = new Parent(33) {
            @Override
            void career() {

            }

            @Override
            void partner() {

            }
        };
    }
}
