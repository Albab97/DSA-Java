package properties.abstractDemo;

public abstract class Parent {
    int age;
    final int VALUE;

    public Parent(int age) {
        this.age = age;
        VALUE = 3245445;
    }
    static void greetings(){
        System.out.println("Greetings from Parents."); // we can create a static method in an Abstract class.
    }
    void normal(){
        System.out.println("this is a normal method.");
    }
    abstract void career();
    abstract void partner();
}
