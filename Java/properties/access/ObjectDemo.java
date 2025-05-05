package properties.access;

import java.io.ObjectStreamException;

public class ObjectDemo {
    int num;
    float val;
    public ObjectDemo(int num,float val) {
        this.num = num;
        this.val = val;
    }
    public ObjectDemo(ObjectDemo obj){
        this.num=obj.num;
        this.val = obj.val;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
//        return num; // overriding hashCode function - to give the num itself.
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        return this.num == ((ObjectDemo)obj).num; // typecasting into ObjectDemo class.
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // seen the below 2 methods previously.
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(29, 8.67f);
        ObjectDemo obj2 = new ObjectDemo(81, 56.90f);
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());

        ObjectDemo obj3 = obj;
        System.out.println(obj3.hashCode()); // hashcode is same means its the same object, just a referencing it with obj3 variable this time.

        ObjectDemo obj4 = new ObjectDemo(32,45.21f);
        ObjectDemo obj5 = new ObjectDemo(32,90.08f);
        if(obj4 == obj5){
            System.out.println("obj4 is equal to obj5"); // does not print anything both objects are actually different
        }
        if(obj4.equals(obj5)){
//            System.out.println("obj4 is equals to obj5"); // does not print anything using default equals method because Java gets confused which value you comparing - num or val ?
            System.out.println("obj4 is equals to obj5"); //prints it when we have overridden equals method.
        }

        System.out.println(obj2 instanceof ObjectDemo);
        System.out.println(obj2 instanceof Object); // every object is an instance of Object class.

        System.out.println(obj4.getClass().getName());
    }
}
