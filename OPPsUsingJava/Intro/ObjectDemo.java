package abhi.Intro;

import java.util.Objects;

public class ObjectDemo {
    int num;
    float gpa;

    @Override
    public String toString() {
        return "ObjectDemo{" +
                "num=" + num +
                '}';
    }

    // we will go in details of how to create it in hashmap lecture
    @Override
    public int hashCode() {
        // it gives an number representation of an object
//        return super.hashCode();
        // it doesn't give address
        return num;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(34, 33.3f);
        ObjectDemo obj2 = new ObjectDemo(34, 3343.34f);
//        System.out.println(obj1.hashCode());
//        System.out.println(obj2.hashCode());

        if (obj1 == obj2){
            System.out.println("obj1 is less than obj2");
        }

        if (obj1.equals(obj2)){
            System.out.println("obj1 is equal to obj2");
        }

        System.out.println(obj1.getClass().getName());

    }

}
