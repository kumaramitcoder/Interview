package interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Capgimini {
    public static void main(String[] args) {
//        I remove consecutive duplicate characters from the string "aaabccaatt" to get the output "abcat"?
        String s = "aaabccaatt";
        String output = removeConsecutiveDuplicate(s);
        System.out.println(output);
    }
    public static String removeConsecutiveDuplicate(String s){
       if (s==null || s.length()<=1){
           return s;
       }
       StringBuilder stringBuilder = new StringBuilder();
       stringBuilder.append(s.charAt(0));
       for (int i =1; i<s.length(); i++){
           if (s.charAt(i)!=s.charAt(i-1)){
               stringBuilder.append(s.charAt(i));
           }
       }
       return stringBuilder.toString();
    }

    public static String removeConsecutiveDups(String s){
        if (s==null || s.length()<=1){
            return s;
        }
        char[] chars = s.toCharArray();
        int j =0;
        for (int i=1; i<chars.length; i++){
            if (chars[i] != chars[j]){
                chars[++j]=chars[i];
            }
        }
        return new String(chars, 0, j+1);
    }
}
