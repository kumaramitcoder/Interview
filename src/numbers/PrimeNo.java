package numbers;

public class PrimeNo {
    public static void main(String[] args) {
        int num = 20;
        if (prime(num)){
            System.out.println(num+" is a prime no ");
        } else {
            System.out.println(num+" is not a prime no ");
        }
    }
    public static boolean prime(int n){
       if (n<=1){
           return false;
       }
       for (int i=2; i<=Math.sqrt(n); i++){
           if (n%i==0)
               return false;
       }
       return true;
    }
}
