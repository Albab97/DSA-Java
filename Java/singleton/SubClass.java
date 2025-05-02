package singleton;

import properties.access.A;

public class SubClass extends A {
    // This class is being created to show the usage of protected data member in class 'A' of package access.
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(20,"Almaan");
        String name = obj.name; // able to access name because it is protected which is being accessed in SubClass which is a subclass of A (even if it is outside its package).
        System.out.println(name);

        A obj1 = new A(23,"Ayan");
//        String name1 = obj1.name; // not able to access name even inside SubClass of A through the instance of 'A'.
    }
}
