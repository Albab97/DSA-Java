package singleton;

import properties.access.A;

public class NotASubClass {
    // This class is being created to show the usage of protected data member in class 'A' of package access.

    public static void main(String[] args) {
        SubClass obj = new SubClass(20,"Almaan");
//        String name = obj.name; // not able to access name because it is protected which is being accessed in class which is not a subclass of A.
//        System.out.println(name);

    }
}
