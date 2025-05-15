package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int secondhigh = findSecondLargest_2(arr);
        System.out.println(secondhigh);
    }
    public static int findSecondLargest(int[] arr){
        return Arrays.stream(arr)
                .boxed()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow(()-> new IllegalArgumentException("Array doesn't have second highest"));

    }

    public static int findSecondLargest_2(int[] arr){
        int largest = Integer.MAX_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : arr){
            if (num>largest){
                secondLargest = largest;
                largest = num;
            } else if(num>secondLargest && num!=largest){
                secondLargest = num;
            }
        }
        return secondLargest;
    }
}
