package TREE;
import java.util.*;
public class LC662_max_bidth_in_binary_tree {
    class Solution {

        class Pair {
            Node node;
            long index;

            Pair(Node node, long index) {
                this.node = node;
                this.index = index;
            }
        }

        public int widthOfBinaryTree(Node root) {

            if (root == null) return 0;

            Queue<Pair> q = new LinkedList<>();
            q.add(new Pair(root, 0));

            int maxWidth = 0;

            while (!q.isEmpty()) {

                int size = q.size();

                long minIndex = q.peek().index;
                long first = 0;
                long last = 0;

                for (int i = 0; i < size; i++) {

                    Pair p = q.poll();

                    Node curr = p.node;

                    // Normalize index at each level
                    long index = p.index - minIndex;

                    if (i == 0) {
                        first = index;
                    }

                    if (i == size - 1) {
                        last = index;
                    }

                    if (curr.left != null) {
                        q.add(new Pair(curr.left, 2 * index + 1));
                    }

                    if (curr.right != null) {
                        q.add(new Pair(curr.right, 2 * index + 2));
                    }
                }

                maxWidth = Math.max(maxWidth, (int)(last - first + 1));
            }

            return maxWidth;
        }
    }
}
