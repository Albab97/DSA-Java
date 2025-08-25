package properties.interfaces.extendDemo2;

public class Main implements B {

    @Override
    public void greet() {
        System.out.println("Good Day!");
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.fun();
        m.greet();
//        m.greeting(); // greeting() is a static interface method
        A.greeting();
    }
}
