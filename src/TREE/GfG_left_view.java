package TREE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GfG_left_view {
    public ArrayList<Integer> leftView(Node root){
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<Node> q=new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int size=q.size();

            for(int i=0;i<size;i++){
                Node n=q.poll();
                if(i==0){
                    ans.add(n.data);
                }

                if(n.left!=null){
                    q.offer(n.left);
                }
                if(n.right!=null){
                    q.offer(n.right);
                }
            }
        }
        return ans;
    }
}

