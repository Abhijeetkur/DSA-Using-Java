package abhi.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student abhijeet = new Student(12, 89.79f);
        Student rahul = new Student(13, 90.9f);
        Student abhishek= new Student(11, 79.79f);
        Student sumit = new Student(1, 80.9f);
        Student prince = new Student(2, 79.79f);
        Student abhinav = new Student(3, 60.9f);

        Student[] list = {abhijeet, rahul, abhishek, sumit, prince, abhinav};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.rollno - o2.rollno;
            }
        });
        System.out.println(Arrays.toString(list));

//        if (abhijeet.compareTo(rahul) < 0){
//            System.out.println("Rahul has more marks");
//        }
    }
}
