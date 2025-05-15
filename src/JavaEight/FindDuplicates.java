package JavaEight;

import java.util.HashSet;
import java.util.Set;

//2. Find Duplicate Elements in an Array using HashSet
public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,5,6,3};
        System.out.println("--");
        findDuplicates(arr);
        System.out.println("**");

    }
    public static void findDuplicates(int[] arr){
        Set<Integer> set = new HashSet<>();
        for (int num : arr){
            if (!set.add(num)){
                System.out.println("Duplicate: " + num);
            }
        }
    }

}
