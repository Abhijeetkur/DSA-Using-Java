package abhi.generics.WildCard;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildCard {
    public static void main(String[] args) {
        // Integer List
        List<Integer> list1 = Arrays.asList(1, 2, 3);

        // Double list
        List<Double> list2 = Arrays.asList(1.1, 2.2, 3.3);

        //String list
        List<String> list3 = Arrays.asList("Abhijeet", "Abhinav", "Divyanshu");

        printlist(list1);

        printlist(list2);
        printlist(list3);
    }

    private static void printlist(List<?> list) {

        System.out.println(list);
    }
}
