package Trees;
import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;
public class LevelOrders {
    public static void levelsInOrder(TreeNode root){
        Queue<TreeNode> q=new LinkedList<>();
        if(root!=null) q.add(root);
        while(q.size() > 0){
            TreeNode front=q.remove();
            System.out.print(front.val + " ");
            //print left to right
            if(front.left != null) q.add(front.left);
            if(front.right !=null) q.add(front.right);

        }
        System.out.println();

    }
    public static void main(String[] args){
        TreeNode a=new TreeNode(1);  // a is the root
        TreeNode b=new TreeNode(2);
        TreeNode c=new TreeNode(3);
        TreeNode d=new TreeNode(4);
        TreeNode e=new TreeNode(5);
        TreeNode f=new TreeNode(6);
        // make connections
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.right=f;
        System.out.println(a);
        System.out.println();
        System.out.println("level of order " );
        levelsInOrder(a);
    }
}
