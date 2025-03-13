public class poweOfn {
    public static int powern(int n ,int p){
        if(p==0)return 1;
        return n*powern(n,p-1);
    }
    public static void main(String[] args) {
        System.out.println(powern(2, 10));
    }
}
