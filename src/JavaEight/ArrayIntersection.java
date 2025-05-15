package JavaEight;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//3. Find Intersection of Two Arrays using Set
public class ArrayIntersection {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6};
        int[] arr1 = {7,7,3,6,5,8,9};
        System.out.println(Arrays.toString(intersection(arr, arr1)));
    }

    public static int[] intersection(int[] arr1, int[] arr2){
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for (int num:arr1){
            set.add(num);
        }
        for (int num : arr2){
            if (set.contains(num)){
                result.add(num);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
