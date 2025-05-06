package properties.interfaces.extendDemo2;

public interface B extends A {
    void greet();

    @Override
    default void fun() {        // this will override previous default method
        System.out.println("This is another.");
    }
}
