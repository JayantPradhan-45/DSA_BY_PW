package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Levelsorder03 {
    public static class pair{
        TreeNode node;
        int level;
        pair(TreeNode node , int level){
            this.node=node;
            this.level=level;
        }

    }
    private static void levelsorder(TreeNode root){
        int prevlvl=0;
        Queue<pair> q=new LinkedList<>();
        if(root != null) q.add(new pair(root,0));
        while(q.size()>0){
            pair front=q.remove();
            TreeNode temp=front.node;
            int lvl=front.level;
            if(lvl !=prevlvl){
                System.out.println();
                prevlvl++;
            }
            System.out.print(temp.val+ " ");
            if(temp.left != null) q.add(new pair(temp.left,lvl+1));
            if(temp.right != null) q.add(new pair(temp.right,lvl+1));

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
        TreeNode g=new TreeNode(7);
        TreeNode h=new TreeNode(8);
        TreeNode i=new TreeNode(9);
        // make connections
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;
        e.left=h;e.right=i;
        System.out.println();
        levelsorder(a);
    }
}
