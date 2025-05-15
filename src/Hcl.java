import java.util.Arrays;

public class Hcl {
    public static void main(String[] args) {
        System.out.println("To find the longest word (or \"max string\") in a sentence");

        String s = "java springboot microservices";
        String maxStr = findMaxString(s);
        String maxStrStream = findMaxStringStreamApi(s);
        System.out.println("Longest Word: "+ maxStr);
        System.out.println(maxStrStream);


    }

    public static String findMaxString(String s){
        String[] words = s.split(" ");
        String maxString = "";

        for (String word: words){
            if (word.length() > maxString.length()){
                maxString = word;
            }
        }
        return maxString;
    }

    public static String findMaxStringStreamApi(String s){
        return
                Arrays.stream(s.split(" "))
                        .max((a,b)->Integer.compare(a.length(), b.length()))
                        .orElse("");
    }
}
