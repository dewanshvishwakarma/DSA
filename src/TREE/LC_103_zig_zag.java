package TREE;

import javax.swing.tree.TreeNode;
import java.util.*;

public class LC_103_zig_zag {

    static public List<List<Integer>> zigzagLevelOrder(Node root){
        List<List<Integer>> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();

        if (root==null){
            return ans;
        }
        q.add(root);
        boolean l=true;
        while (!q.isEmpty()){
            int size=q.size();
            List<Integer> level=new ArrayList<>();
            for (int i=0;i<size;i++){
                Node n=q.poll();
                level.add(n.data);

                if (n.left!=null){
                    q.add(n.left);
                }
                if(n.right!=null){
                    q.add(n.right);
                }

            }
            if (!l){
                Collections.reverse(level);
            }
            l=!l;
            ans.add(level);
        }
return ans;
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);

        root.left.left=new Node(4);
        root.left.right=new Node(5);

        root.right.left=new Node(6);
        root.right.right=new Node(7);

        List<List<Integer>> ans=zigzagLevelOrder(root);

        for (int i=0;i<ans.size();i++){
            for (int j=0;j<ans.get(i).size();j++){
                System.out.println(ans.get(i).get(j) +  " ");
            }
            System.out.println();
        }
    }
}
