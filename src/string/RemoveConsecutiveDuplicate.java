package string;

public class RemoveConsecutiveDuplicate {
    public static void main(String[] args) {
       String s = "aaabccaatt";
       String string = removeConsecutiveDuplicate(s);
       System.out.println(string);
    }
    public static String removeConsecutiveDuplicate(String s){
        if (s==null || s.length()<=1){
            return s;
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s.charAt(0));

        for (int i = 1; i<s.length();i++){
            if (s.charAt(i) != s.charAt(i-1)){
                stringBuilder.append(s.charAt(i));
            }
        }

        return stringBuilder.toString();

    }
}
