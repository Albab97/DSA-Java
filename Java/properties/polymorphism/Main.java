package properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        s1.area();

        Circle s2 = new Circle();
        s2.area();

        Shape s3 = new Square();
        s3.area();
    }
}
