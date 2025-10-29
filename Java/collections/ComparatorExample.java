package collections;

import enumExample.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class ComparatorString implements Comparator<String> {
//    we want smaller length string to come before bigger length string.
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
    // "ok" "hello"
}

class MyComparator implements Comparator<Integer>{
//    The general rule is :
//    If we want o1 before o2 then compare function should return negative.
//    If we want o2 before o1 then compare function should return positive.
//    If we want o2 = o1 then compare should return 0.

    // for descending order
    @Override
    public int compare(Integer o1, Integer o2){
        return o2-o1;
    }
    // 5 3
}

public class ComparatorExample {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("kiwi");
        fruits.add("pineapple");

//        fruits.sort(null);  // default order is ascending
        fruits.sort(new ComparatorString());

        System.out.println(fruits);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(19);
        numbers.add(9);
        numbers.add(78);
        numbers.add(109);

        numbers.sort(new MyComparator());

        System.out.println(numbers);
    }
}
