package exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
//            int c = a/b;
//            divide(a,b);
            String name = "Albab";
            if(name.equals("Albab")){
                throw new MyException("name is Albab");
            }
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){       // if it's not an Arithmetic exception then it will be caught here. We can't place it before
                                    // the ArithmeticException because Exception is the parent class and it will automatically catch
                                    // the Arithmetic exceptions also.
            System.out.println(e.getMessage());
        }finally {
            System.out.println("this will always execute");
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
//        if(b==0){
//            throw new ArithmeticException("please throw this exception");
//        }
        return a/b;
    }
}
