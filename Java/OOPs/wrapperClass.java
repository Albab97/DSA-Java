package OOPs;

public class wrapperClass {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        swap(a,b); // fake swap
        System.out.println(a+" "+b);

        Integer c = 198;
//        Integer c = new Integer(45); // same as above line, treats c as a reference to an object whose value is 45.
        // now we can perform many operation on this object 45.
        System.out.println(c.floatValue());
        System.out.println(c.toString());
        System.out.println(c.byteValue());

        Integer d = 68;

        swapIt(c, d); // still not swap because Integer class is a final class.
        System.out.println(c+" "+d);

        final int INCREASE = 2; // we can't modify it later so always initialize the final variable while declaring it.
//        INCREASE = 3; NOT ALLOWED TO MODIFY FINAL VARIABLE
        final A var = new A("Albab");
//        var.num = 11; cannot modify this since num is final variable.
        System.out.println(var.name+" "+var.num);
        var.name="Ahmed";
        System.out.println(var.name+" "+var.num);

        final A var2 = new A("Chris");
//        var = var2; // not allowed since var is final, it will point to the same object;


        // Since heap memory will not be able to handle so many objects it will automatically goes to Garbage collector and gets destroyed.
//        for(int i = 1; i<1000000000 ; i++){
//            obj = new A("random object");
//        }
    }
    static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }
    static void swapIt(Integer c, Integer d){
        Integer temp = d;
        d = c;
        c = temp;
    }
    public static class A{
        final int num = 10;
        String name;

        A(String name){
            this.name = name;
        }

        @Override
        protected void finalize() throws Throwable{
            System.out.println("Object is destroyed");
        }
    }
}
