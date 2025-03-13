package trees;

public class SearchWithoutRrecurssion {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){ this.val=val;}
    }
    public static int height (Node root){
        if (root==null)return 0;
        if(root.left==null && root.right==null)return 0;
        return 1+ Math.max(height(root.left),height(root.right));
    }
    public static void post_order(Node root){
        if(root==null)return;
        inorder_traversal(root.left);
        inorder_traversal(root.right);
        System.out.print(root.val+" ");

    }
    public static void preorder_traversal(Node root){
        if(root==null)return ;
        System.out.print(root.val+" ");
        preorder_traversal(root.left);
        preorder_traversal(root.right);
    }
    public static void inorder_traversal(Node root){
        if (root==null)return ;
        post_order(root.left);
        System.out.print(root.val+" ");
        post_order(root.right);

    }
    public static void print_nth(Node root,int n){
        if(root==null)return;
        if(n==1) System.out.print(root.val+" ");
        print_nth(root.left,n-1);
        print_nth(root.right,n-1);
    }
    public static void main(String[] args) {
        Node root =new Node(1);
        Node a=new Node(2);
        Node b =new Node(3);
        root.left=a;
        root.right=b;
        Node c=new Node(4);
        Node d=new Node(5);
        a.left=c;
        a.right=d;
        Node e =new Node(6);
        Node f=new Node(7);
        b.left=e;
        b.right=f;
        System.out.println(height(root));
        inorder_traversal(root);
        System.out.println();
        preorder_traversal(root);
        System.out.println();
        post_order(root);
        System.out.println();

        for(int n=1, i=0;i<height(root)+1;i++,n++){
            print_nth(root,n);
            System.out.println();
        }

    }
}
