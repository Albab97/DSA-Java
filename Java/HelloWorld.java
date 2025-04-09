public class HelloWorld {
    static int age = 27;
    //DataTypes and Operators
    public static void main(String[] args){
        int age = 28;
        System.out.println("I am "+ age+ " years old.");
        char copyrightSymbol = '\u00A9';
        System.out.println("copyright symbol -> "+copyrightSymbol);

        int number1 = 5;
        double number2 = number1;
        System.out.println(number2);

        double value1 = 5.9;
        int value2 = (int) value1;
        System.out.println(value2);

        double num1 = 12;
        int num2 = 5;

        System.out.println(num1/num2);
        System.out.println(num1%num2);

        System.out.println(num1!=num2);

        System.out.println(num1>=10 && num1<=20);
        System.out.println(num1>=23 || num1<=10);

        boolean isStudent = true;
        boolean isMember = false;
        System.out.println(!isStudent);
        System.out.println(isMember || isStudent );

        System.out.println(num2++);
        System.out.println(num2);
        System.out.println(--num2);
    }
}
