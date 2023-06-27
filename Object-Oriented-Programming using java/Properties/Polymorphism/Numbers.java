package abhi.Properties.Polymorphism;

public class Numbers {
    int sum(int a, int b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }

    double sum(double a, int b, int c){
        return a + b + c;
    }
    public static void main(String[] args) {
        Numbers obj = new Numbers();
       double b =  obj.sum( 2.34, 3, 4);
        System.out.println(b);

    }
}
