package properties.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son s = new Son(28);
        s.career();
        System.out.println(s.VALUE);
        System.out.println(s.age);

        Daughter d = new Daughter(26);
        d.career();

//        Parent p = new Parent(55); // We cannot create objects out of abstract classes.
        Parent.greetings();
        d.normal();

        Parent D = new Daughter(30); // we can use the reference variable of the abstract class also.
        D.career();
        D.greetings();
    }
}
