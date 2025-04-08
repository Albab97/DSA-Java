import java.util.Scanner;

public class conditionalStatement {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("What operation do you want to perform ? ");
        String operation = scanner.nextLine();

        switch (operation){
            case "div":
                if (number2==0){
                System.out.println("Cannot divide by zero.");
                }else {
                System.out.printf("%f / %f = %f",number1,number2,number1/number2);
                }
                break;
            default:
                System.out.printf("%s is not supported",operation);
        }

//        if(operation.equals("div")){
//            if (number2==0){
//                System.out.println("Cannot divide by zero.");
//            }else {
//                System.out.printf("%f / %f = %f",number1,number2,number1/number2);
//            }
//        }else {
//            System.out.printf("%s is not supported",operation);
//        }
    }
}
