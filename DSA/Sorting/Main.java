import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[]={1,6,4,3,51,3,45,0,8};
        System.out.println(Arrays.toString(arr));
        // BubbleSort.sort(arr);
        // InsertionSort.sort(arr);
        // SelectionSort.sort(arr);
        // MergeSort.sort(arr,0,arr.length-1);
        QuickSort.sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }
}
