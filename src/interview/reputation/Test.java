package interview.reputation;

import java.util.*;

public class Test {
    public static void main(String[] args) {
//        Input : [1,2,3,1,2,4,2,2,3,4,3,2]
//        Output : [2,2,2,2,2,3,3,3,4,4,1,1]

        int[] arr = {1,2,3,1,2,4,2,2,3,4,3,2};
        sortarray(arr);
    }

    public static void sortarray(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : arr){
            map.put(i,map.getOrDefault(i, 0)+1);// 2 - 2
        }
        System.out.println(map);
        List<Integer> list = new ArrayList<>();
        for (int j : arr)
            list.add(j);

        list.sort((a, b)->{
            int freq = map.get(b).compareTo(map.get(a));
            return freq;
        });

        System.out.println(list);

//        list.sort((a, b)->{
//            int frequency = map.get(b).compareTo(map.get(a));
//            return frequency !=0 ? frequency : a.compareTo(b);
//        });

//        System.out.println(list);

    }
}
