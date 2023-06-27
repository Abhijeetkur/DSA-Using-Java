package abhi.Properties.Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box(4);
//        Box box2 = new Box((box1));
//        System.out.println(box1.l + " " + box1.w + " " + box1.h);
//        System.out.println(box2.l + " " + box2.w + " " + box2.h);

//        BoxWeight box3 = new BoxWeight();
//        System.out.println(box3.l + " " + box3.w + " " + box3.h + box3.weight);

//        BoxWeight box4 = new BoxWeight(2, 3, 4, 5);
//        System.out.println(box4.l + " " + box4.h + " " + box4.w + " "+ box4.weight);

//        Box box5 = new BoxWeight(3, 4, 5, 6); // it is just like your parent is in your college and known by referencing you
//        System.out.println(box5.w); // can access it's own traits
//        System.out.println(box5.weight); // can't access child class traits

        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // this is why error
//        BoxWeight box6 = new Box(2, 3, 4);
//        Box a = new BoxWeight(); // This will only call those methods which were defined in Box(Parent class).

        BoxPrice b = new BoxPrice(1, 2, 4);

    }
}
