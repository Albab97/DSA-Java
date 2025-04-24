package properties.inheritance;

public class BoxWeight extends Box{
    double weight;

    BoxWeight(){
        this.weight = -1;
    }
    public BoxWeight(double l,double w, double h, double weight){
        super(l, w, h); // call the parent class constructor
        // used to initialize the values present in parent class.
        this.weight = weight;
    }

}
