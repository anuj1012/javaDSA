package Strings;

public class shortestpath {
    public static void shortest(String str){
        int x=0; int y=0;
      for (int i=0;i<str.length();i++){
       char ch=str.charAt(i);
       if(ch=='E'){
          x++;
       }if(ch=='W'){
          x--;
       }if(ch=='N'){
          y++;
       }if(ch=='S'){
          y--;
       }
      }
      System.out.println("the shortest path will be "+x+","+y);
    }
    public static void main(String[] args) {
        String str="WNEENESENNN";
        shortest(str);
    }
}
