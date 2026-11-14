package TREE;
import java.util.*;
public class GFG_right_view {

    public ArrayList<Integer> right_view(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                Node n = q.poll();
                if (i == size - 1) {
                    ans.add(n.data);
                }

                if (n.left != null) {
                    q.offer(n.left);
                }
                if (n.right != null) {
                    q.offer(n.right);
                }
            }
        }
        return ans;
    }}
