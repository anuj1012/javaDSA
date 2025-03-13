public class sumOfn {
    public static int sum(int n){
        if(n<=0){
            return 0; 
        }
        int s =sum(n-1)+n;
        return s;
    }
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}
