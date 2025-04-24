package properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(5,3,2.5);
        System.out.println(box1.l+" "+box1.w+" "+box1.h);

        Box box2 = new Box(4);
        System.out.println(box2.l+" "+box2.w+" "+box2.h);

        BoxWeight box3 = new BoxWeight();
        System.out.println(box3.l+" "+ box3.weight);

        BoxWeight box4 = new BoxWeight(4.54,9.65,10.6,15.123);
        System.out.println(box4.l+" "+box4.w+" "+box4.h+" "+box4.weight);
    }
}
