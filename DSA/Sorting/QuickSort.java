public class QuickSort {
    public static void sort(int arr[],int start,int end){
        if(start<end){
            int part=partition(arr,start,end);
            sort(arr, start, part-1);
            sort(arr,part+1,end);
        }
    }
    public static int partition(int arr[],int start,int end){
        int pi=arr[start];
        int i=start;
        int j=end;

        while(i<j){
            while(i<end&&arr[i]<=pi){
                i++;
            }
            while(j>start&&arr[j]>pi){
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,start,j);

        return j;
    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
