package TREE;

import java.util.LinkedList;
import java.util.Queue;

public class BFS_templete {

    static void Bfs(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {
            Node n = q.poll();

            System.out.println(n.data + " ");

            if (n.left != null) {
                q.add(n.left);

                if (n.right != null) {
                    q.add(n.right);
                }
            }
        }
    }
        public static void main (String[]args){
            Node p=new Node(1);
            p.left=new Node(2);
            p.right=new Node(3);

            Bfs(p);
        }

}