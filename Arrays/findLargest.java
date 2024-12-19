package Arrays;

public class findLargest {
    public static int largest(int arr[]){
        int k=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>k){
                k=arr[i];
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int arr[]={24,5,664,747,3436,47,4745};
        System.out.println(largest(arr));
    }
}
