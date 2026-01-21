public class SortedArray{

    static boolean isArraySorted(int arr[],int n){
        if(n==1)return true;
        if(arr[n-1]>=arr[n-2]){
            return isArraySorted(arr, n-1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[]={3,2,3,4,5,6,7};
        System.out.println(isArraySorted(arr,arr.length));
    }
}