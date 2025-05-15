package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};
        System.out.println(findDuplicate(arr));
    }
    public static List<Integer> findDuplicate(int[] arr){
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i:arr){
            if (!set.contains(i) && !list.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}
