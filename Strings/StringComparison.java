package Strings;

public class StringComparison {
    public static void main(String[] args) {
        String str1="Anuj";
        String str2="Anuj";
        String str3 =new String("Anuj");
        System.out.println(str1==str2);
        System.out.println(str2==str3);
        System.out.println(str2.equals(str3));
    }
}
