import java.util.Scanner;

public class userInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your nickname ? ");
        String nickname = scanner.nextLine(); // nextLine() methods consumes the input from user and the carriage return <enter>.
//        System.out.println(nickname);
        System.out.printf("Hello %s, how old are you ?",nickname);
        int age = scanner.nextInt(); // nextInt() only consumes the input number from user and not the carriage return <enter>.
        scanner.nextLine(); // Therefore we have to put another nextLine() before going ahead so that carriage return <enter> gets consumed.
//        Alternate method : Just use this instead of nextInt() -> int age = Integer.parseInt(scanner.nextLine());
        System.out.printf("%d is a perfect age to start programming. Which language do you prefer ?",age);
        String language = scanner.nextLine();
        System.out.printf("Great ! %s is a very popular programming language.",language);
        scanner.close();
    }
}
