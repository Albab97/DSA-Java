package properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(5,3,2.5);
        System.out.println(box1.l+" "+box1.w+" "+box1.h); // Can't access box1.l if double l is private. Similarly, for box2 and box3.

        Box box2 = new Box(4);
        System.out.println(box2.l+" "+box2.w+" "+box2.h);

        BoxWeight box3 = new BoxWeight();
        System.out.println(box3.l+" "+ box3.weight);

        BoxWeight box4 = new BoxWeight(4.54,9.65,10.6,15.123);
        System.out.println(box4.l+" "+box4.w+" "+box4.h+" "+box4.weight);

        // reference variable box5 is of type Box(parent), so it will be able to access the attributes of Box class and not of BoxWeight.
        Box box5 = new BoxWeight(4,6,2,8);
        System.out.println(box5.w);
//        System.out.println(box5.weight); // error - weight attribute not there in Box class.

        // below statement throws an error. Why ?
        // you are given access to attributes of reference type class, i.e BoxWeight
        // hence you should have access to weight class. Means, the one you are trying to access must be initialized.
        // but here when the object is of type parent class then how will you call the constructor of child class.
        // that is why below statement throws an error.
//        BoxWeight box6 = new Box(3,7,9);

        BoxPrice box7 = new BoxPrice(3,5,20);
        System.out.println(box7.l+" "+box7.price);

        Box box8 = new BoxWeight();
        box8.greeting(); // This will call the greeting method of Box and not that of BoxWeight class because static methods cannot be overridden.
        BoxWeight.greeting(); // static method can be inherited.
    }
}
