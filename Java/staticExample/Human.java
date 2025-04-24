package staticExample;

public class Human {
    int age;
    String name;
    int salary;
    char gender;
    boolean married;
    static long population;
    static void message(){
        System.out.println("Don't be deceived by worldly life.");
//        System.out.println(this.age); // cannot use this over here because it is a static method (not dependent on any instance) but this keyword indicates an object reference
    }
    public Human(int age, String name, int salary, char gender, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.married = married;
        Human.population += 1; // this.population can also be used but since population is a static variable and belongs to the class and not to an instance of class(object) therefore its better to use Human.population (no warnings).
    }
}
