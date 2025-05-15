package javaBasicToAdvance;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Automation";
        StringBuilder stringBuilder = new StringBuilder(str).reverse();
        System.out.println(stringBuilder);
    }
}
