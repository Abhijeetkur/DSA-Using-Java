package abhi.Intro;

public class Test {
    public static void main(String[] args) {

        Student abhi = new Student();
        System.out.println(abhi.rno);
        System.out.println(abhi.name);
        System.out.println(abhi.marks);
        abhi.changeName("Prince Kumar");
        abhi.greeting();

        Student abhijeet = new Student(11, "Abhi Kumar", 90.0f);
        System.out.println(abhijeet.rno);
        System.out.println(abhijeet.name);
        System.out.println(abhijeet.marks);

        Student random = new Student(abhijeet);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.rno);

        Student one = new Student();
        Student two = one;
        one.name = "Something Something";
        System.out.println(two.name);
    }
}

class Student{
    int rno;
    String name;
    float marks;

    void greeting(){
        System.out.println("Hello my name is " + name);
    }

    void changeName(String chageName){
        this.name = chageName;
    }

    Student (){
        // Internally, it is like new Student (3, "Abhijeet Kumar", 90.0f)
        this (3, "Abhijeet Kumar", 90.0f);
    }
    Student (Student other){
        // copy constructor
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

//    Student () {
//        this.rno = 03;
//        this.name = "Abhijeet Kumar";
//        this.marks = 90.0f;
//    }

    Student (int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
