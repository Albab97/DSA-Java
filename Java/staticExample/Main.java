package staticExample;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello you are in Main.");
        System.out.println(Human.population);
        Human h1 = new Human(21,"Ayan",30000,'M',false);
        System.out.println(h1.population);
        Human h2 = new Human(27,"Jeeshu",45000,'M',false);
        Human h3 = new Human(25,"Ramsha",36000,'F',false);

        System.out.println(h1.population);
        System.out.println(h2.population);
        System.out.println(h3.population);

        Main.fun();
//        this.fun2(); // we cannot use this or super keyword in static class.

    }
    static void fun(){
//        greeting();  // you can't use this because it requires an instance
        // but the function you are using it in ( fun() ) does not depend on instances.

        // you cannot access a non-static stuff without referencing their instances in a static context(block/scope).

        // hence, here we are referencing it
        Main obj = new Main();
        obj.greeting();
    }

    void fun2(){
        greeting(); // allowed, both fun2 and greeting needs an object
    }
    void greeting(){
//        fun(); // we can access a static member in a non-static class.
//        this.fun2(); // we can use 'this' keyword in non-static class but not in static class.
        System.out.println("Have a good day.");
    }
}
