package sorting_searching;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        //Bubble Sort Selection Sort Insertion Sort Merge Sort Quicksort
        //Bubble Sort
        int[] data = { -2, 45, 0, 11, -9 };
        Sorting.bubbleSort(data);
        System.out.println(Arrays.toString(data));
        //SelectionSort
        int arr[] = {64, 25, 12, 22, 11};
        Sorting.SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //Bubble Sort
    public static void bubbleSort(int[] arr){
        int size = arr.length;
        for (int i = 0; i<size-1;i++){
            for (int j=0; j< size-i-1;j++){
                if (arr[j]>arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //Selection Sort

    public static void SelectionSort(int[] arr){
        int length = arr.length;
        for (int i=0; i<length-1;i++){
            int minIndex = i;

            for (int j=i+1; j<length;j++){
                if (arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

    }
}
