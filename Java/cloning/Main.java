package cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human h = new Human(29,"Albab Ahmed");
//        Human twin = new Human(h);
//        System.out.println(twin.name);

        Human twin= (Human) h.clone();
        System.out.println(h.age+" "+h.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0]=100;

        System.out.println(Arrays.toString(twin.arr)); //this shows that twin is a deep copy now.
        System.out.println(Arrays.toString(h.arr));
    }
}
