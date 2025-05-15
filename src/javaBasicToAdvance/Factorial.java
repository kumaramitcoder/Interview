package javaBasicToAdvance;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int fact = 1;

        for (int i=1; i<=num;i++){
            fact*=i;
        }
        System.out.println(fact);
        System.out.println("");
        int n1=6;
        int res = fact(n1);
        System.out.println(res);
    }

    public static int fact(int n){
        if (n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}
