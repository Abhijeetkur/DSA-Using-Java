package abhi.generics.WildCard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowerBoundWildCard {
    public static void main(String[] args) {
        // Lower Bounded Integer List
        List<Integer> list1 = Arrays.asList(4, 5, 6, 7);

        // Integer list object is being passed
        printOnlyIntegerClassorSuperClass(list1);

        // Number list
        List<Number> list2 = Arrays.asList(4, 5, 6, 7);

        // Integer list object is being passed
        printOnlyIntegerClassorSuperClass(list2);

//        // Double list
//        List<Double> list3 = Arrays.asList(4.0, 5.1, 6.1, 7.0);
//        // Double list object is being passed
//        printOnlyIntegerClassorSuperClass(list3);
    }
    /*
    Explanation:
    Here arguments can be Integer or superclass of Integer(which is Number).
    The method printOnlyIntegerClassOrSuperClass will only take Integer or its superclass objects.
    However, if we pass a list of types Double then we will get a compilation error.
    It is because only the Integer field or its superclass can be passed. Double is not the superclass of Integer
     */

    public static void printOnlyIntegerClassorSuperClass(List<? super Integer> list) {
        System.out.println(list);
    }
}
