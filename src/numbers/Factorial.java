package numbers;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        long res = fact(n);
        System.out.println(res);
    }

    public static long fact(int n){
        if (n==0 || n==1){
            return 1;
        }
       return n*fact(n-1);
    }

}
