package staticExample;

public class InnerClass {
    // Below static class does not need an instance of InnerClass to be created in order to implement itself. That is why we can use it in main method (which is also static).
    static class Test{
//        String name;
        static String name;

        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Albab");
        Test b = new Test("Ayan");

        // Above two statements will create a separate instances ( a and b ) of static Class Test. Hence, in the following line it will print their own name values and not the same one.
        // But if we name the name attribute inside the Test class as static - then it means it is common to all the objects created for class Test. Then o/p will be Ayan Ayan
        System.out.println(a.name); // Albab // We can also access using Test.name when name is static
        System.out.println(b.name); // Ayan

        System.out.println(a);
    }
}
