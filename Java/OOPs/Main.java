package OOPs;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Student student1; // As of now here 'student1' is only a reference variable in the stack memory. It just declares a reference to an Object of type Student
        student1 = new Student(); // allocate a Student object. Here Student() - is actually a special type of function called constructor

        student1.marks = 90f;
        // before printing first it will check the object if that property value exists there, if yes then it will print that and if no then
        // it will print the by default value.
        System.out.println(student1.name); // this is by default Null
        System.out.println(student1.rno); // by default 0
        System.out.println(student1.marks); // by default 80.0

        // It would be very difficult to allocate values to different properties of an object if there are 100 properties. So we use Constructors


    }
    static class Student{
        Student(){

        }
        int rno;
        String name;
        float marks = 80; // default value if nothing is specified
    }
}
