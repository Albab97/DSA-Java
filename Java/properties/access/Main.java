package properties.access;

public class Main {
    public static void main(String[] args) {
        A obj = new A(32,"Albab");
        // need to do two things:
        // 1. access the data members
        // 2. modify the data members

        int i = obj.getNum(); // able to access getNum() method since it is public.
        System.out.println(i);
//        int n= obj.num // not able to access num outside the 'A' class since it is private

        SubClass obj1 = new SubClass(12,"Ayat");
        String name = obj1.name; // protected can be accessed inside the same package via an instance of SubClass even if Main is not a sub class of A.
        System.out.println(name);

        A obj2 = new A(14,"Ali");
        String name2 = obj2.name; // protected can be accessed inside the same package via an instance of A class.
        System.out.println(name2);
    }
}
