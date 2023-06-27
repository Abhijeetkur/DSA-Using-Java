package abhi.Static;
// this is a demo to show initialisation of static variable
public class StaticBlock {
    static int a = 4;
    static int b;

    static {
        // this block will run only once when the first objec is created i.e.when the class is loaded for first time
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args){
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;

        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
