package properties.interfaces.nestedInterfaces;

public class C {
    public interface NestedInterface{
        boolean isOdd(int num);
    }
}

class B implements C.NestedInterface{

    @Override
    public boolean isOdd(int num) {
        return (num%2 != 0);
    }
}