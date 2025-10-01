import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[]={1,6,4,3,51,3,45,0,8};
        System.out.println(Arrays.toString(arr));
        InsertionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
}
