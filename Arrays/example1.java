package Arrays;
import java.util.*;

public class example1 {
    public static void print(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

   public static void update(int arr[]){
    for (int i=0;i<arr.length;i++){
        System.out.print(arr[i]+10+" ");
    }
    System.out.println();
   }
 public static void main(String args[]){
    int arr[]={12,13,45,67,86,64};
    print(arr);
    update(arr);

 }   
}
