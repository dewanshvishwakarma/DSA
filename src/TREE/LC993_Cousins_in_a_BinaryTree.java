package TREE;
import java.util.*;

public class LC993_Cousins_in_a_BinaryTree {
    public boolean isCousins(Node root, int x, int y) {

        if (root == null) {
            return false;
        }

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {

            int size = q.size();

            boolean found_x = false;
            boolean found_y = false;

            for (int i = 0; i < size; i++) {

                Node n = q.poll();

                if (n.data== x) {
                    found_x = true;
                }

                if (n.data == y) {
                    found_y = true;
                }

                // Check whether x and y are siblings
                if (n.left != null && n.right != null) {

                    if ((n.left.data == x && n.right.data == y) ||
                            (n.left.data== y && n.right.data == x)) {
                        return false;
                    }
                }

                if (n.left != null) {
                    q.offer(n.left);
                }

                if (n.right != null) {
                    q.offer(n.right);
                }
            }

            // Both found at the same level
            if (found_x && found_y) {
                return true;
            }

            // Only one found at this level
            if (found_x || found_y) {
                return false;
            }
        }

        return false;
    }
}
