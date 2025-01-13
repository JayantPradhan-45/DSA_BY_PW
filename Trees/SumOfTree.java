package Trees;

import java.util.Scanner;

public class SumOfTree {
    static int n;
    public static void nthlevel(TreeNode root, int level){
        if(root==null) return ;
        if(level==n) System.out.print(root.val+ " ");
        nthlevel(root.left,level+1);
        nthlevel(root.right,level+1);
    }
    private static void Display(TreeNode root) {
        if (root == null) return; // base case
        System.out.print(root.val + " "); // self value
        Display(root.left); // left sub tree
        Display(root.right); // right sub tree


    }

    private static int sum(TreeNode root) {
        if (root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);

    }

    private static int size(TreeNode root) {
        if (root == null) return 0;
        return 1 + size(root.left) + size(root.right);

    }

    private static int level(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(level(root.left), level(root.right));

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TreeNode a = new TreeNode(1);  // a is the root
        TreeNode b = new TreeNode(41);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(2);
        TreeNode e = new TreeNode(6);
        TreeNode f = new TreeNode(5);
        // make connections
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        Display(a);
        System.out.println();
        System.out.println(sum(a));
        System.out.println(size(a));
        System.out.println(level(a));
        System.out.println("enter n");
        n=sc.nextInt();
        nthlevel(a,n);



    }
}