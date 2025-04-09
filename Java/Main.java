import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] arguements) {
        System.out.println("Hello World!");
//        Without using Constructor
//        User youngerUser = new User();
//        youngerUser.name = "Albab Ahmed Jr.";
//        youngerUser.birthDay = LocalDate.parse("1997-07-31");

        User youngerUser = new User("Albab Ahmed Jr.","1997-07-31");
        System.out.printf("%s was born back on %s and he is %d yrs now. \n",youngerUser.getName(),youngerUser.getBirthDay(),youngerUser.age());
//        Without using constructor
//        User olderUser = new User();
//        olderUser.name = "Albab Ahmed Sr.";
//        olderUser.birthDay = LocalDate.parse("1958-03-15");
        User olderUser = new User("Albab Ahmed Sr.","1958-03-15");
        System.out.printf("%s was born back on %s and he is %d yrs now. \n",olderUser.getName(),olderUser.getBirthDay(),olderUser.age());

        Book book = new Book();
        book.title = "Sapiens";
        book.author = "Yuval Noah Harari";

        youngerUser.borrow(book);
        System.out.printf("%s has borrowed these books - %s \n",youngerUser.getName(),youngerUser.books.toString());
    }
}