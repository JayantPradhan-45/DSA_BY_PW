package Trees;
public class DisplayTree {
    public static void Display(TreeNode root){
        if(root== null) return ; // base case

        System.out.print(root.val + " "); // self value
        Display(root.left); // left sub tree
        Display(root.right); // right sub tree




    }

    public static void main(String[] args){
        TreeNode a=new TreeNode(1);
        TreeNode b=new TreeNode(2);
        TreeNode c=new TreeNode(3);
        TreeNode d=new TreeNode(4);
        TreeNode e=new TreeNode(5);
        TreeNode f=new TreeNode(6);
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.right=f;
        Display(a);

    }
}
