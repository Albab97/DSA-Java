package properties.polymorphism;

public class Square extends Shape{
    @Override
    void area(){
        System.out.println("Area is a*a.");
    }
//    @Override - cannot override a static method
//    static void perimeter() {
//        System.out.println("Perimeter is 4*a");
//    }
}
