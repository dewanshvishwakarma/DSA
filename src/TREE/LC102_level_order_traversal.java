package TREE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LC102_level_order_traversal {

    static List<List<Integer>> level_order(Node root){
        List<List<Integer>> ans=new ArrayList<>();

        Queue<Node> q=new LinkedList<>();

        if (root==null){
            return ans;
        }

        q.add(root);
        while (!q.isEmpty()){
            int size=q.size();
            List<Integer> level=new ArrayList<>();

            for (int i=0;i<size;i++){
                Node n =q.poll();
                level.add(n.data);

                if (n.left!=null){
                    q.add(n.left);
                }
                if (n.right!=null){
                    q.add(n.right);
                }
            }
            ans.add(level);
        }
        return ans;
    }
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);

        root.left.left=new Node(4);
        root.left.right=new Node(5);

        root.right.left=new Node(6);
        root.right.right=new Node(7);
    }
}
