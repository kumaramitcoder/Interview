package sorting_searching;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original Array: " + Arrays.toString(arr));
        selectionSorts(arr);
        System.out.println("Original Array: " + Arrays.toString(arr));
    }

    private static void selectionSorts(int[] arr) {
        int n = arr.length;
        for (int i=0; i<arr.length;i++){
            int minindex = i;
            for (int j=i+1; j<arr.length;j++){
                if (arr[j]<arr[minindex]){
                    minindex = j;
                }
            }
            int temp = arr[minindex];
            arr[minindex] = arr[i];
            arr[i] = temp;
        }

    }
}
