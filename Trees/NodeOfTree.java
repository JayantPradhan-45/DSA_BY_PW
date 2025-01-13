package Trees;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    //constructor
    TreeNode(int val){
        this.val=val;
    }
}
public class NodeOfTree {
    public static void main(String[] args) {
        //make new node
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
        System.out.println(e.val);
        System.out.println(a.left.right.val);

    }
}
