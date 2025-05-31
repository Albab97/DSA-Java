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

        // It would be very difficult to allocate values to different properties of an object if there are 100 properties.
        // So we use Constructors
        // Example below for using Parameterized constructor
        Student student2 = new Student(45,"Rajesh", 56.88F);
        System.out.println(student2.marks);
        student2.greetings();

        Student student3 = new Student(student1);
        System.out.println(student3.name);

        Student student4 = new Student();
        Student student5 = student4;
        student4.name = "Travis";
        System.out.println(student5.name);

    }
    static class Student{
        // Constructor and Constructor Overloading
//        Student(){
//            this.rno = 10;
//            this.name = "Albab Ahmed";
//            this.marks = 80f;
//        }
        // Parameterized Constructor
        Student(int rno, String name, float marks){
            this.rno = rno;
            this.name = name;
            this.marks = marks;
        }
        Student(Student other){
            this.rno = other.rno;
            this.name = other.name;
            this.marks = other.marks;
        }
        Student(){
            // this is how you call a constructor from another constructor.
            // this is same as saying -> new Student(1,"default person",100);
            this (1,"default person",100);
        }
        // Or we can do like below. Internally Java is smart and knows that rno, name , marks are for the object without even specifying this keyword.
//        Student(int roll, String naam, float score){
//            rno = roll;
//            name = naam;
//            marks = score;
//        }
        int rno;
        String name;
        float marks = 80; // default value if nothing is specified

        void greetings(){
            System.out.println("Hello my name is "+this.name);
        }

        void changeName(String newName){
            this.name = newName;
        }

    }
}
