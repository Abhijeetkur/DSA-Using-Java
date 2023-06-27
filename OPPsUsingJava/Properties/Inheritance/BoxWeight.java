package abhi.Properties.Inheritance;

public class BoxWeight extends Box {
    double weight = 12;

    public BoxWeight() {
//        this.weight = -1;
        System.out.println(this.weight);// this is used to access variable(weight) of child class
        System.out.println(super.weight); // this is used to access variable(weight) of parent class
    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }
    BoxWeight (BoxWeight other) {
        super(other);
        weight = other.weight;
    }
    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // what is this? this will call the parent class constructor
        // used to initialise the values present in parent class
        this.weight = weight;
        // if we use super.variable_name at the place of this.variable_name we will not get error
        // we can access specifically base class variable from base class using super.variable_name

    }

}
