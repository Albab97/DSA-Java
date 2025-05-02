package properties.access;

public class SubClass extends A{

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(20,"Almaan");
        String name = obj.name; // able to access name because it is protected which is being accessed in SubClass which is a subclass of A.
        System.out.println(name);

    }
}
