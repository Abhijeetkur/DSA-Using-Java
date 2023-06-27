package abhi.Properties.Inheritance;

public class Box {
    double l;
    double h;
    double w;

    double weight = 2;

    Box () {
        super(); // it is working cause every class inherit things from object class
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    //cube
    Box (double side) {
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box (Box old){
        // copy constructor
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void information() {
        System.out.println("Running the box");
    }
}
