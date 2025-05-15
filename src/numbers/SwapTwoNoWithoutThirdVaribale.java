package numbers;

public class SwapTwoNoWithoutThirdVaribale {
    public static void main(String[] args) {
        //Method 1: Using Arithmetic (+ and -)
        int a=5, b=10;
        System.out.println("Before swap : a= "+a+",b = "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swap : a = "+a+",b = "+b);
        //Method 2: Using Bitwise XOR
        int x=5, y=10;
        System.out.println("Before swap : x = "+x+",y = "+y);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swap a = "+a+", b = "+b);



    }
}
