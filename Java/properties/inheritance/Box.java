package properties.inheritance;

public class Box { // public final class Box - this will create a problem because final class cannot be inherited hence BoxWeight cannot extend Box.
//    private double l; // private variables can't be accessed outside this class.
    double l;
    double w;
    double h;

//    double weight;

    Box(){
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    Box(double l, double w, double h){
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(double side){
//        super(); // calls Object class constructor
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    static void greeting(){
        System.out.println("Hey I am in Box class. Greetings!");
    }

    public void information(){
        System.out.println("This is a box");
    }
}
