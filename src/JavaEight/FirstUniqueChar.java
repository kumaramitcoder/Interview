package JavaEight;

import java.util.HashMap;
import java.util.Map;
//1. Find First Non-Repeating Character in a String using HashMap
public class FirstUniqueChar {
    public static void main(String[] args) {
        String s = "swiss";
        System.out.println(firstUniqueChar(s));
    }
    public static char firstUniqueChar(String str){
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if (entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return '-';
    }
}
