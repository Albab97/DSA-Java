package foundation;

public class IsPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(19));
        System.out.println(isPrime(28));
        System.out.println(isPrimeOptimized(29));
        System.out.println(isPrimeOptimized(33));
        printPrime(6,24);
    }
    static boolean isPrime(int n){
        boolean flag = true;
        if(n==0 || n==1)
            return false;
        else
            for(int i=2;i<n;i++){
                if(n%i==0){// this means number n is divisible by i
                    flag = false;
                }
            }
        return flag;
    }
    static boolean isPrimeOptimized(int n){
        boolean flag = true;
        if(n==0 || n==1)
            return false;
        else
            for(int i=2;i*i<=n;i++){
                if(n%i==0){// this means number n is divisible by i
                    flag = false;
                }
            }
        return flag;
    }
    static void printPrime(int low, int high){
        for(int i = low ; i<=high; i++){
            if(isPrimeOptimized(i)){
                System.out.println(i+" ");
            }
        }
    }
}
