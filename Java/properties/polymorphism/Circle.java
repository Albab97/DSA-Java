package properties.polymorphism;

public class Circle extends Shape{
    // this will run when obj of Circle is created
    // hence it is overriding the parent method
    @Override // this is called annotation
    void area(){
        System.out.println("Area is pie*r*r.");
    }

    public static void main(String[] args) {
        Shape s1 = new Circle();
        s1.area();
    }
}
