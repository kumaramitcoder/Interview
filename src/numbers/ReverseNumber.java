package numbers;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 1234;
        int rev = reverse(n);
        System.out.println(rev);
    }
    public static int reverse(int n){
        int rev = 0;
        while (n!=0){
            int digit = n%10;
            rev = rev *10+digit;
            n/=10;

        }
        return rev;
    }
}
