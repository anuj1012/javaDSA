public class checkSorted {
    public static boolean issorted(int arr[],int i){
        int l=arr.length-1;
        if(i==l) return true;
        if(arr[i]>arr[i+1])  return false;
        return issorted(arr,i+1);
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,1};
        System.out.println(issorted(arr, 0));
    }
}
