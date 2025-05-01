package properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        s1.area();

        Circle s2 = new Circle();
        s2.area();

        Shape s3 = new Square(); // ref variable is of type superclass and the method called is of type subclass. Object type defines which method to run and Reference type define which method we can access.
        s3.area(); // Here which method will be called depends on the object class (subclass). This is called Upcasting.
    }
}
