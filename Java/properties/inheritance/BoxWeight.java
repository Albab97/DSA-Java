package properties.inheritance;

public class BoxWeight extends Box{
    double weight;

    BoxWeight(){
        // No super() here, but Java implicitly adds super();
        this.weight = -1;
//        super.weight = -1; // this refers to the weight attribute of class just above BoxWeight class,i.e. weight attribute in Box class
//        this.l = 4; // can't access this.l if l is private.
    }

    BoxWeight(BoxWeight other){
        super(other); // this is similar to Box box5 = new BoxWeight(4,6,2,8); which is allowed.
        weight = other.weight;
    }
    public BoxWeight(double l,double w, double h, double weight){
        super(l, w, h); // call the parent class constructor
        // used to initialize the values present in parent class.
        // we can still access private double l in super because super is actually going in Box class and then calling the constructor.
        this.weight = weight;

//        super(l,w,h); // can't initialize BoxWeight class variables first because Box don't know/care about BoxWeight but BoxWeight do care about Box class.
    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }
//    @Override // Static methods cannot be overridden but they can be inherited.
//    static void greeting(){
//        System.out.println("Hey I am in BoxWeight class. Greetings!");
//    }

}
