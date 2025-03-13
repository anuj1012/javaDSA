package trees;

public class implementatioin {

    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }

    public static int height(Node root){
        if(root==null|| root.left==null&&root.right==null)return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }

    public static int sumoftree(Node root){
        if(root==null)return 0;
        return root.val+(sumoftree(root.left)+sumoftree(root.right));
    }

    public static void display(Node x){
        if(x==null)return;
        System.out.print(x.val+" -> ");
        if(x.left!=null) System.out.print(x.left.val+" ");
        if(x.right!=null) System.out.print(x.right.val+" ");
        System.out.println();
        display(x.left);
        display(x.right);
    }

    public static int maximum(Node root){
        if(root==null)return Integer.MIN_VALUE;
        return Math.max(root.val,(Math.max(maximum(root.left),maximum(root.right))));
    }

    public static int size(Node root){
        if(root==null)return 0;
        return 1+size(root.left)+size(root.right);
    }

    public static int minimum(Node root ){
        if(root==null)return Integer.MAX_VALUE;
        return Math.min(root.val,Math.min(minimum(root.left),minimum(root.right)));
    }

    public static int product(Node root){
        if(root==null)return 1;
        return root.val*product(root.left)*product(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        Node a =new Node(4);
        Node b =new Node (10);
        root.left=a;
        root.right=b;
        Node c =new Node(6);
        Node d =new Node(5);
        a.left=c;
        a.right=d;
        Node e=new Node(8);
        b.right=e;
        display(root);
        System.out.println("Maximum Node of the tree->"+maximum(root));
        System.out.println("Sum of the tree-> "+sumoftree(root));
        System.out.println("Size of the tree-> "+size(root));
        System.out.println("Minimum Node of the tree-> "+minimum(root));
        System.out.println("Product of the nodes of tree-> "+product(root));
        System.out.println("Height of the tree-> "+height(root));
    }

}
