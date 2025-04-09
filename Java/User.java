import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
    private String name;
    private LocalDate birthDay;
    public ArrayList<Book> books = new ArrayList<Book>();
    public int age(){
        Period age = Period.between(this.birthDay,LocalDate.now());
        return age.getYears();
    }
    public void borrow(Book book){
        this.books.add(book);
    }

    //Constructor
    User(String name,String birthDay){
        this.name = name;
        this.birthDay = LocalDate.parse(birthDay);
    }
    //Getter methods to access private attributes
    public String getName(){
        return this.name;
    }
    public String getBirthDay(){
        return this.birthDay.toString();
    }
}
