package Arrays;

public class Interview_Ques {
    public static void main(String[] args) {
        String name = "Ahmed";
        System.out.println(name.substring(2,5));
        char[] arr = name.toCharArray();
        System.out.println(arr.length);
        for (int i = arr.length-1; i >= 0 ; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
