package cloning;

public class Human implements Cloneable{
        int age;
        String name;
        int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3,5,8,9,1,2};
    }

//    public Human(Human other){
//        this.age = other.age;
//        this.name = other.name;
//    }

//    @Override
//    public Object clone() throws CloneNotSupportedException {
//            return super.clone(); // this is actually a shallow copy. Shallow copy will create new variable for primitive datatypes
//                                // but it will only create reference to the non-primitive Datatypes(Objects like array,String,etc.)
//    }

    //to Create a deep copy (comment out below code to see the demonstration of shallow copy).

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Human twin = (Human)super.clone(); // this is a shallow copy
        // this creates a deep copy. Deep copy is copy of the Object in which the non-primitive Object types are also actually copied and a separate object is created.
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
