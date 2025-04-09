import java.util.Arrays;

public class Array {
    public static void main(String[] args){

        char vowels[] = {'a','e','i','o','u'};
        vowels[2]='x';
//        char vowels[] = new char[5];
//
//        vowels[0]='a';
//        vowels[1]='e';
//        vowels[2]='i';
//        vowels[3]='o';
//        vowels[4]='u';
        System.out.println(vowels.length);
        System.out.println(Arrays.toString(vowels));

        char alphabets[] = {'x','d','s','a','x'};
        Arrays.sort(alphabets);
        int startingIndex = 1;
        int endingIndex = 4;
//        Arrays.sort(alphabets,startingIndex,endingIndex);
//        Arrays.fill(alphabets,startingIndex,endingIndex,'x');
        System.out.println(Arrays.toString(alphabets));
        int itemIndex = Arrays.binarySearch(alphabets,'s'); //works only on sorted arrays, for an unsuccessful search output is negative
        System.out.println(itemIndex);

        int numbers[] = {1,2,3,4,5};

        int copyOfNumbers[] = numbers;

        Arrays.fill(numbers,0);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(copyOfNumbers)); // it also shows [0,0,0,0,0] because copyOfNumbers arrays is only a reference type or alias for numbers and is pointing to the same array.

        // To make an actual copy use Arrays method copyOf
        int values[]={1,2,5,7};
        int realCopy[] = Arrays.copyOf(values,values.length);
//        int realCopy[] = Arrays.copyOfRange(values,1,2);
        Arrays.fill(values,0);
        System.out.println(Arrays.toString(values));
        System.out.println(Arrays.toString(realCopy));

        // To compare two Arrays
        int array1[] = {1,2,3,4};
        int array2[] = Arrays.copyOf(array1,array1.length);
        System.out.println(array1 == array2); // false, since both array1 and array2 are different reference types ( different pointers )
        System.out.println(Arrays.equals(array1,array2));
    }
}
