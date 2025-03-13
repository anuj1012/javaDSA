public class firstoccurance {
    public static int firstime(int arr[],int k,int i){
     if(i==arr.length) return -1;
     if(arr[i]==k)return i;
     return firstime(arr, k, i+1);
    }
    public static void main(String[] args) {
        int arr[]={2,5,67,7,2,7,2,1,4};
        System.out.println(firstime(arr, 4, 0));
    }
}
