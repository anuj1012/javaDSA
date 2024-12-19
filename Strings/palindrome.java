package Strings;

public class palindrome {
    public static boolean checkpalindrome(String str){
        
        for(int i=0;i<str.length();i++){
            char l=str.charAt(str.length()-1-i);
            if(str.charAt(i)!=l){
             return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str ="anna";
        System.out.println(checkpalindrome(str));

    }
}
