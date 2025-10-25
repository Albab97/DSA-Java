package properties.access;

import org.w3c.dom.ls.LSOutput;

public class SubClass extends A{
    public SubClass(int num, String name) {
        super(num, name);
    }
    public static void main(String[] args) {
        SubClass obj = new SubClass(20,"Almaan");
        String name = obj.name; // able to access name because it is protected which is being accessed in SubClass of A via an instance of its derived class (SubClass).
        System.out.println(name);

        A obj2 = new A(17, "Maryum");
        System.out.println(obj2.name); // able to access because its in the same package
    }
}

class SubSubClass extends SubClass{

    public SubSubClass(int num, String name) {
        super(num, name);
    }
    SubSubClass obj = new SubSubClass(32,"Rambo");
//    obj.name; // able to access name because it is protected.
}

class SubClass2 extends A{
    public SubClass2(int num, String name) {
        super(num, name);
    }
    SubClass2 obj = new SubClass2(18,"Tyler");
//    obj.name; // able to access name because it is protected.

}