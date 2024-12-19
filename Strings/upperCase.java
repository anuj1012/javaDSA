package Strings;

public class upperCase {
    public static String uppercase(String str){
        StringBuilder sb=new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));
        for (int i=1;i<str.length();i++){
            char ch =str.charAt(i);
            if(ch==' '){
                sb.append(ch);
                i++;
                if(i+1<str.length()){
                    sb.append(Character.toUpperCase(str.charAt(i)));
                }
            }else sb.append(ch);
        }
        
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="hi my name is anuj";
       System.out.println(uppercase(str));
    }
}
