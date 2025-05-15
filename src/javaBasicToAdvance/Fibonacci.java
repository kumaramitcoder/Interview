package javaBasicToAdvance;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series: "+num1+","+num2);
        for (int i =2; i<n; i++){
           int num3 = num1+num2;
            System.out.print(", "+num3);
            num1=num2;
            num2 = num3;
        }
        System.out.println("");
        int n1 = 12;
       for (int i = 0; i<=n;i++){
           System.out.print(Fibonacci(i)+" ");
       }
    }

    public  static  int Fibonacci(int n){
        if (n<2){
            return n;
        }

        return Fibonacci(n-1)+Fibonacci(n-2);
    }
}
