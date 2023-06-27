package abhi.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human abhijeet = new Human(23, "Abhijeet Kumar");
//        Human twin = new Human(abhijeet);
        Human twin = (Human)abhijeet.clone();

        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 100;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(abhijeet.arr));
    }
}
