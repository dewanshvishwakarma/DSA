package TREE;

public class LC572_SubTree_of_another_tree {
    class Solution {
        public boolean isSubtree(Node root, Node subRoot) {

            if (subRoot == null) {
                return true;
            }

            if (root == null) {
                return false;
            }

            if (isSameTree(root, subRoot)) {
                return true;
            }

            return isSubtree(root.left, subRoot) ||
                    isSubtree(root.right, subRoot);
        }

        private boolean isSameTree(Node p,Node q) {

            if (p == null && q == null) {
                return true;
            }

            if (p == null || q == null) {
                return false;
            }

            if (p.data != q.data) {
                return false;
            }

            return isSameTree(p.left, q.left) &&
                    isSameTree(p.right, q.right);
        }
    }
}
