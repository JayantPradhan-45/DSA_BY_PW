package Trees;
import java.util.Scanner;
public class NthLevelOrder {
    static int n;
    public static void nthlevel(TreeNode root, int level){
        if(root==null) return ;
        if(level==n)  System.out.print(root.val+ " ");
        nthlevel(root.left,level+1);
        nthlevel(root.right,level+1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        TreeNode a=new TreeNode(1);  // a is the root
        TreeNode b=new TreeNode(2);
        TreeNode c=new TreeNode(3);
        TreeNode d=new TreeNode(4);
        TreeNode e=new TreeNode(5);
        TreeNode f=new TreeNode(6);
        TreeNode g=new TreeNode(7);
        TreeNode h=new TreeNode(8);
        TreeNode i=new TreeNode(9);
        // make connections
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;
        e.left=h;e.right=i;


//        System.out.println("enter n");
//        n=sc.nextInt();
//        nthlevel(a,0);

        // if we want to print all number according to level in serial order
        for(int j=0;j<=3;j++){
            n=j;
            nthlevel(a,0);


        }

    }
}
