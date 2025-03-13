package trees;

import java.util.LinkedList;
import java.util.Queue;

public class traversals {
    public static class Node{
        Node left;
        Node right;
        int val;
        Node(int val){
            this.val =val;
        }
    }
    public static void  elementofnthlevel(Node root,int level){
        if(root==null)return;
        if(level==1){
            System.out.print(root.val+"  ");
            return;
        }

        elementofnthlevel(root.left,level-1);
        elementofnthlevel(root.right,level-1);
    }
    public static void bfswithqueue(Node root){
     Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            if(q.peek().left!=null)q.add(q.peek().left);
            if(q.peek().right!=null)q.add(q.peek().right);
            System.out.print(q.remove().val+"  ");
     }
    }
    public static void preorder(Node root){
        if(root==null)return;
        System.out.print(root.val+"  ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root==null)return;
        inorder(root.left);
        System.out.print(root.val+"  ");
        inorder(root.right);

    }
    public static void postorder (Node root){
        if(root==null)return;
       postorder(root.left);
       postorder(root.right);
        System.out.print(root.val+"  ");
    }
    public static void main(String[] args) {

        Node root =new Node(1);
        Node a=new Node(2);
        Node b=new Node (3);
        root.left =a;
        root.right=b;
        Node c=new Node(4);
        Node d=new Node(5);
        a.left=c;
        a.right=d;
        Node f=new Node(6);
        Node e=new Node(7);
        b.left=f;
        b.right=e;

        preorder(root);
        System.out.println();

        inorder(root);
        System.out.println();

        postorder(root);
        System.out.println();

        
//        elementofnthlevel(root,1);
//        System.out.println();
//        elementofnthlevel(root,2);
//        System.out.println();
//        elementofnthlevel(root,3);
//        System.out.println();
        bfswithqueue(root);

    }
}
