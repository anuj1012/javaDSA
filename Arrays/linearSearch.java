package Arrays;

import java.util.*;
public class linearSearch {

    public static void print(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int linearsearch(int arr[],int k){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={14,59,48,69,30,37};
        linearsearch(arr,59);
        // System.out.println(arr.length);
    }
}
