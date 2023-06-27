package abhi.generics.WildCard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class UpperBoundedWildCard {
    public static void main(String[] args) {
        // Upper Bound Integer List
        List<Integer> list1 = Arrays.asList(1, 3, 5, 4, 5);
//        List<String> list1 = Arrays.asList("Abhi", "Jeet");
        double ans = sum(list1);
        System.out.println(ans);


        // Upper Bound Double List
        List<Double> list2 = Arrays.asList(4.1, 5.5, 5.3);
        double ans2 = sum(list2);
        System.out.println(ans2);
    }

    /* Explanation:
    In the above program, list1 and list2 are objects of the List class. list1 is a collection of Integer
    and list2 is a collection of Double. Both of them are being passed to method sum which has a
    and list2 is a collection of Double. Both of them are being passed to method sum which has a
    and list2 is a collection of Double. Both of them are being passed to method sum which has a
     */

    public static double sum(List<? extends Number> list){
        double sum = 0.0;
        for (Number i : list){
            sum += i.doubleValue();
        }
        return sum;
    }
}
