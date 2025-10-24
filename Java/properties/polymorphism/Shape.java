package properties.polymorphism;

public class Shape {
    void area(){
        System.out.println("I am in Shape.");
    }
    // Early Binding
//    final void area(){  // A method with final cannot be overridden.
//        System.out.println("I am in Shape.");
//    }
    static void perimeter(){
        System.out.println("This is the perimeter.");
    }
}
