package collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        animals.push("Lion");
        animals.push("Elephant");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println(animals);

        //to print what is on the top : Last In First Out (LIFO)
        System.out.println(animals.peek());

        animals.pop();

        System.out.println(animals);

    }
}
