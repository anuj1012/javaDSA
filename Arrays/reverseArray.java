package Arrays;

public class reverseArray {
    public static void reverse(int arr[]){
     int f=0; int l=arr.length-1;
     while(f<l){
        int temp=arr[l];
        arr[l]=arr[f];
        arr[f]=temp;
        f++;l--;

     }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={3,546,747,453,2};
        reverse(arr);
        print(arr);

    }
}
