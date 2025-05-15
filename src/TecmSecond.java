public class TecmSecond {

    public static void main(String[] args) {

        int[] arr = {5,4,7,8,10,45,21,11};

    }

    //Quick sort
    public static void quickSort(int[] arr, int low, int high){
        if (low<high){
            int pi = partition(arr, low, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;
        for (int j=low; j<=high;j++){
            if (arr[j]<pivot){
                i++;
                swap(arr,i ,j);
            }
        }
        swap(arr, i+1, high);
        return i+1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp= arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
    }
}
