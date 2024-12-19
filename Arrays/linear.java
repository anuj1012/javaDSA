package Arrays;
import java.util.*;
public class linear{
    public static int linear(int arr[],int k){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }
    public static void main(String []args){
        int arr[]={42,53,64,75,86,45,2,53,65};
        System.out.println(linear(arr,64));
    }
}