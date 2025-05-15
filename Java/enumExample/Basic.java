package enumExample;

public class Basic {

    enum Week implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enum constants.
        // public, static and final
        // since it is final we cannot create child enums
        // type is Week
        Week(){
            System.out.println("Constructor called for "+this);
        }
        // this is not public or protected, only private or default
        // why? we dont want to create new objects
        // this is not the enum concept, thats why

        // internally: public static final Week Monday = new Week();

        //        void display(); // abstract methods are not allowed.
        void display(){
            System.out.println("display me");
        }

        @Override
        public void hello() {
            System.out.println("hey hello there");
        }
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        System.out.println(week);
        week.display();
        System.out.println(week.ordinal());
        for (Week day: Week.values()){
            System.out.print(day+ " ");
        }
        System.out.println();
        week.hello();
    }
}
