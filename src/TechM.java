import java.sql.ClientInfoStatus;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TechM {
    public static void main(String[] args) {
        System.out.println("Interview");

        List<Emplyee> list = Arrays.asList(new Emplyee("Amit", 3000),
                new Emplyee("Kumar", 5500), new Emplyee("Harish",6500), new Emplyee("ram", 7800)
                );


        // How many no of Employee for there salary

        Map<String, List<Emplyee>> collect = list.stream()
                .collect(Collectors.groupingBy(Emplyee::getName));

        for (Map.Entry<String, List<Emplyee>> entry : collect.entrySet()){
            System.out.println(entry.getKey() +"=" +entry.getValue());
        }


    }
}

