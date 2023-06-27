package abhi.Intro;

public class WrpperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
        // It will not swap cause in in java everything is pass by value not pass by reference means only values will pass to swap(a, b) not reference.

        Integer a = 10;
        Integer b = 20;
        // This is creating object and it is pass by reference value not pass by value still it is not swapping cause Integer is a final class.

        swap(a, b);

        System.out.println(a);
        System.out.println(b);
        // It will not swap cause in in java everything is pass by value not pass by reference means only values will pass to swap(a, b) not reference.

       final A abhi = new A("Abhijeet Kumar");
       abhi.name = "Other name";

       // When a non-primitive is final, You can'r reassign it
//       abhi = new A("new Object");

        for (int i = 0; i < 100000000; i++) {
            A x = new A("Abhijeet Kumar");
        }

    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}

class A {
    final int num = 10;
    String name;
    A (String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
