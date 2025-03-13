package practice;
import java.util.*;
import java.util.ArrayList;

public class Test {
    public static void main(String [] args){
//        System.out.println(args[0]);
        List<String> arr =new ArrayList<>();
        int[] arr1 = {'a','b','c','d'};
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        Map<String,Integer>marks =new HashMap<>();
        marks.put("anuj",52);
        marks.put("Riya",35);

        for(Map.Entry<String,Integer> entry:marks.entrySet()){
            System.out.print(entry.getKey()+"----");
            System.out.println(entry.getValue());
        }
    }
}
