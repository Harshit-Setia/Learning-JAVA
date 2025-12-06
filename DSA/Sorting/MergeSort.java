public class MergeSort {
    static void merge(int arr[],int left,int mid,int right){
        int sortedArr[]=new int[right-left+1];
        int first=left;
        int second=mid+1;
        int i=0;
        while (first<=mid&&second<=right) {
            if(arr[first]<arr[second]){
                sortedArr[i++]=arr[first++];
            }
            else{
                sortedArr[i++]=arr[second++];
            }
        }
        while (first<=mid) {
            sortedArr[i++]=arr[first++];
        }
        while (second<=right) {
            sortedArr[i++]=arr[second++];
        }
        i=0;
        while(left<=right){
            arr[left++]=sortedArr[i++];
        }
    }

    public static void sort(int arr[],int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            sort(arr,left,mid);
            sort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }
}
