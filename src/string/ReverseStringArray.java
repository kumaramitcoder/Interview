package string;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReverseStringArray {
    public static void main(String[] args) {
        String[] strings = {"hello", "world", "spring","java", "spring"};

        String collect = Arrays.stream(strings)
                .map(s -> new StringBuilder(s).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println(collect);

        Map<String, Long> collect1 = Arrays.stream(strings)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect1.forEach((a,b)->{
            System.out.println(a+" "+b);
        });
    }

}
