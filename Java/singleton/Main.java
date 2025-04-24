package singleton;

public class Main {
    public static void main(String[] args) {
//        SingletonClass obj = new SingletonClass(); // Not allowed since the constructor is private

        SingletonClass obj1 = SingletonClass.getInstance(); // Its the first time when the getInstance() method will run and an instance is created.

        SingletonClass obj2 = SingletonClass.getInstance(); // Here getInstance() will just return the reference to the instance created above.

        SingletonClass obj3 = SingletonClass.getInstance(); // Here getInstance() will just return the reference to the instance created above.

        // All three reference variables are pointing to the same object.
    }
}
