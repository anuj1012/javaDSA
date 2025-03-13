public class example {
    private static void descend(int n){
      if(n<=0)return ;
      System.out.println("now the no. is"+ n);
      descend(n-1);
    }

    public static void ascend(int n){
      if(n<=0)return ;
      ascend(n-1);
      System.out.println("now the no. is"+ n);
    }
    
    public static void main(String[] args) {
        // descend(10);
        ascend(10);

    }
}
