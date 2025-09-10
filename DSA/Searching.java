public class Searching {
    public static int linearSearch(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearchIterative(int[] arr, int key){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(right-left)/2+left;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] arr, int key,int left,int right){
        if(left<=right){
            int mid=(right-left)/2+left; 
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                return binarySearchRecursive(arr, key, left, mid-1);
            }
            else{
                return binarySearchRecursive(arr, key, mid+1, right);
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[]={1,3,4,5,6,9,12,45,56,67};
        System.out.println(linearSearch(arr, 5));
        System.out.println(binarySearchIterative(arr, 45));
        System.out.println(binarySearchRecursive(arr, 0, 0, arr.length-1));
    }
}
