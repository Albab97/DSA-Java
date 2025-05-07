package generics;

import properties.access.A;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i+1);
        }
        arr.forEach((item)->{           //forEach basically takes a Consumer type as a function. Consumer is a generic interface.
            System.out.print(item*2+" ");
        });
        System.out.println();
        Consumer<Integer> fun = (item) -> {  // Lambda functions can be stored in Interface type.
            System.out.print(item+" ");
        };
        arr.forEach(fun);
        System.out.println();
        Operation sum = (a,b)-> a+b ;
        Operation sub = (a,b)-> a-b ;
        Operation prod = (a,b)-> a*b ;

        LambdaFunction myCalculator = new LambdaFunction();
        System.out.println(myCalculator.operate(4,3,sub));
        System.out.println(myCalculator.operate(4,3,sum));
        System.out.println(myCalculator.operate(4,3,prod));

    }
    private int operate(int a, int b, Operation oper){
        return oper.op(a,b);
    }
}

interface Operation{
    int op(int a , int b);
}
