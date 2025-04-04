import java.awt.*;

public class learnStrings {
    public static void main(String[] args){
        char percentSign = '%';
        System.out.println(percentSign);

//        String name="Albab Ahmed";
        String name = new String("Albab Ahmed");
        System.out.println(name);

        String literalString1 = "I am present in String Pool";
        String literalString2 = "I am present in String Pool";
        System.out.println(literalString1 == literalString2);

        String objectString1 = new String("xyz");
        String objectString2 = new String("xyz");
        System.out.println(objectString1 == objectString2);
        System.out.println(objectString1.equals(objectString2));

        String company = "Accenture";
        int age = 27;
        double gpa = 9.4;
        boolean isItTrue = true;
        String formattedString = String.format("Hi, my name is %s. I work for %s and I am %d years old. My GPA is %f. I have attended 100%c of my classes.These are all %b claims.",name,company,age,gpa,percentSign,isItTrue);
        System.out.println(formattedString);
//      System.out.println("Hi, my name is "+name+". I work for "+company+" and I am "+age+" years old.");

        System.out.println(name.length());
        System.out.println(name.isEmpty());
        System.out.println(company.toUpperCase());
        System.out.println(company); // original name is unchanged

        String string = "The sky is blue.";
        String updatedString = string.replace("blue","red");
        System.out.println(updatedString);
        System.out.println(string.contains("sky is"));
    }
}
