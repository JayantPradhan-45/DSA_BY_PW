package Trees;

public class Traversals {
    private static void Preorder(TreeNode root){
        if(root== null) return ; // base case
        System.out.print(root.val + " "); // self value
        Preorder(root.left); // left sub tree
        Preorder(root.right); // right sub tree
    }
    private static void Inorder(TreeNode root){
        if(root== null) return ; // base case

        Inorder(root.left); // left sub tree
        System.out.print(root.val + " "); // self value
        Inorder(root.right); // right sub tree
    }
    private static void Postorder(TreeNode root){
        if(root== null) return ; // base case

        Postorder(root.left); // left sub tree
        Postorder(root.right); // right sub tree
        System.out.print(root.val + " "); // self value
    }

    public static void main(String[] args){
        TreeNode a=new TreeNode(1);  // a is the root
        TreeNode b=new TreeNode(2);
        TreeNode c=new TreeNode(3);
        TreeNode d=new TreeNode(4);
        TreeNode e=new TreeNode(5);
        TreeNode f=new TreeNode(6);
        TreeNode g=new TreeNode(7);
        // make connections
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;
        System.out.println("preorder");
        Preorder(a);

        System.out.println();
        System.out.println("inorder");
        Inorder(a);

        System.out.println();
        System.out.println("postorder");
        Postorder(a);

    }
}
