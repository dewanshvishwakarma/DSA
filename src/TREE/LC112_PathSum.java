package TREE;

public class LC112_PathSum {

        public boolean hasPathSum(Node root, int sum) {
            if (root == null)
                return false;
            if (root.data == sum && root.left == null && root.right == null)
                return true;
            return                                       //
                    hasPathSum(root.left, sum - root.data) || //
                            hasPathSum(root.right, sum - root.data);
        }
}
