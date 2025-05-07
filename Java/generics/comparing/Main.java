package generics.comparing;

import properties.access.A;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Student albab = new Student(10,88.88f);
        Student abhishek = new Student(14,70.24f);
        Student tanishq = new Student(43,58.90f);
        Student kartikeya = new Student(12, 72.87f);
        Student gagan = new Student(16,80.60f);

//    if(albab > abhishek){ // this statement shows an error because Java is confused as to which variable to compare between rollno and marks. For this we have Comparables.
//        System.out.println("Albab has more marks.");
//    }
        // After adding comparators:
        if(abhishek.compareTo(albab)<0){
            System.out.println(albab.compareTo(abhishek));
            System.out.println("albab has more marks");
        }
        Student[] list = {albab, abhishek, tanishq, kartikeya, gagan};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list); // sorted based on marks because of compareTo method. If compareTo method is not there then it will give an error because Java get confused whether to sort on basis of rollno or marks
//        Arrays.sort(list, new Comparator<Student>() {         // This is another way of doing it.
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (int) (o1.marks-o2.marks);
//            }
//        });
        System.out.println(Arrays.toString(list));
    }
}
