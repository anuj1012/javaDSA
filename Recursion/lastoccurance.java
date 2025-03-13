public class lastoccurance {
    public static int lastime(int arr[],int k, int i){
        if(i==arr.length-1)return -1;
        int x= lastime(arr, k, i+1);
        if(x==-1 && arr[i]==k)return i;
     return x;
    }
    public static void main(String[] args) {
     int arr[]={2,2,2,2,4,4,4,5,5,6,6,7,7,8,8,8};
        System.out.println(lastime(arr, 8, 0));
    }
}
