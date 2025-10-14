package Strings;

public class Performance {
    public static void main(String[] args) {
        // This is not a time and space efficient program since every time a char gets appended to the string it will
        // create a new object and in the next iteration that object will be dereferenced and series points to new object.
        // Therefore, many objects will be created which will later be gone to Garbage collector.
        // To edit the same string object we have String Builder class where we can do it efficiently.
        String series="";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+ i );
            series = series + ch;
        }
        System.out.println(series);
    }
}
