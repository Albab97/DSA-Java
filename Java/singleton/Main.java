package singleton;

import properties.access.A;
import properties.access.SubClass;

public class Main {
    public static void main(String[] args) {
//        SingletonClass obj = new SingletonClass(); // Not allowed since the constructor is private

        SingletonClass obj1 = SingletonClass.getInstance(); // Its the first time when the getInstance() method will run and an instance is created.

        SingletonClass obj2 = SingletonClass.getInstance(); // Here getInstance() will just return the reference to the instance created above.

        SingletonClass obj3 = SingletonClass.getInstance(); // Here getInstance() will just return the reference to the instance created above.

        // All three reference variables are pointing to the same object.

        //below code snippet is to show the usage of access modifiers

        A obj = new A(10, "Adeeb");
//        String name = obj.name; // not able to access name as it is protected and can only be accessed in a subclass extending A (Main is not a subclass of A).
    }
}
