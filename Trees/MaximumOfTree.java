package Trees;

public class MaximumOfTree {
    public static int max(TreeNode root){
        if(root==null) return Integer.MIN_VALUE;
        int a=root.val , b=max(root.left) , c=max(root.right);
        return Math.max(a,Math.max(b,c));
    }
    public static void main(String[] args) {
        TreeNode a=new TreeNode(1);  // a is the root
        TreeNode b=new TreeNode(41);
        TreeNode c=new TreeNode(3);
        TreeNode d=new TreeNode(2);
        TreeNode e=new TreeNode(6);
        TreeNode f=new TreeNode(5);
        // make connections
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.right=f;
        System.out.println(max(a));

    }
}
