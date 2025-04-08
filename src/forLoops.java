public class forLoops {
    public static void main(String[] args){
        int sum=0;
        for (int index = 1; index<=10; index++){
            sum+=index;
        }
        System.out.println(sum);
        //Nested for loop
        for (int i = 1; i<=10;i++){
            for (int multiplier = 1;multiplier<=10;multiplier++){
                System.out.printf("%d X %d = %d \n",i,multiplier,i*multiplier);
            }
        }
        //For loops with if condition
        for (int i = 0; i<50;i++){
            if(i%2==0)
                System.out.print(i+ " ");
        }
        System.out.println("");
        // modern for loop
        int numbers[]= {1,2,3,4,5};
        for( int number : numbers)
            System.out.print(number);
    }
}
