import java.util.ArrayList;
import java.util.Comparator;

public class ArrayLists {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println(numbers.toString());
        System.out.println(numbers.get(2)); //pass the index get the value
        numbers.remove(2);
        System.out.println(numbers.toString());
//        numbers.remove(Integer.valueOf(4));
//        System.out.println(numbers.toString());
//        numbers.clear();
//        System.out.println(numbers.toString());
        numbers.set(2,Integer.valueOf(30));
        System.out.println(numbers.toString());

        numbers.add(0);
        numbers.add(7);
        System.out.println(numbers.toString());
        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers.toString());
        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers.toString());

        System.out.println(numbers.size());
        System.out.println(numbers.contains(Integer.valueOf(1)));
        System.out.println(numbers.isEmpty());

        //for each loop
        System.out.println("before : "+ numbers.toString());
        numbers.forEach(num -> {
            numbers.set(numbers.indexOf(num),num*2);
//            System.out.println(num * 2);
        });
        System.out.println("after : "+ numbers.toString());
    }
}
