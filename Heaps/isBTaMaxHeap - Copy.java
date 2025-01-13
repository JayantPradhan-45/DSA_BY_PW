package Heaps;

class Node{
    int val;
    Node left;
    Node right;
    //constructor
    Node(int val){
        this.val=val;
    }
}

public class isBTaMaxHeap {
    public static Boolean isMaxHeap(Node tree){
        int n=size(tree);
        return isHeap(tree) && isCBT(tree,0,n);
    }

    public static boolean isHeap(Node root){
        if(root==null) return true;
        if(root.left != null){
            if(root.val < root.left.val){
                return false;
            }
        }
        if(root.right != null){
            if(root.val < root.right.val){
                return false;
            }
        }
        return isHeap(root.left) && isHeap(root.right);

    }
    private static int size(Node root){
        if(root==null) return 0;
        return 1 + size(root.left) + size(root.right);
    }
    public static boolean isCBT(Node root,int i,int n){
        if(root==null) return true;
        if(i >= n) return false;
        return isCBT(root.left,2*i+1,n) && isCBT(root.right,2*i+2,n);


    }
    public static void main(String[] args){
        //construct a binary tree
        Node a=new Node(10);
        Node b=new Node(8);
        Node c=new Node(7);
        Node d=new Node(6);
        Node e=new Node(4);
        a.left=b; a.right=c;
        b.left=d; c.right=e;
        System.out.println(isMaxHeap(a));

    }
}
