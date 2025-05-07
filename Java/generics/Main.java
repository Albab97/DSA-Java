package generics;

import generics.comparing.GenericInterface;

public class Main implements GenericInterface<Integer> {
    @Override
    public void display(Integer o) {
        // like that we can have generic interface being used by a class.
    }
}
