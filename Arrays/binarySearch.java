package Arrays;

public class binarySearch {

    public static int binary(int arr[],int k){
        int s=0; int e=arr.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(mid==k){
                return mid;
            }
            if(arr[mid]<k){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return -1;
    }
   public static void main(String[] args) {
    int arr[]={2,3,4,5,6,7,8,9,13,14,15};
  System.out.println(binary(arr, 5));
   } 
}
