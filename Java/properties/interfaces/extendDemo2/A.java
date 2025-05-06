package properties.interfaces.extendDemo2;

public interface A {
    // static interface methods always have a body. They can't be inherited ( they are used from interface only !)
    // call via the interface name
    static void greeting(){
        System.out.println("Hey , static greetings!");
    }
    default void fun(){
        System.out.println("this is new additional feature.");
    }
}
