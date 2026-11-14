package TREE;

public class LC_104_maximum_depth_of_binaryTree {
    public int maxDepth(Node root) {
        if(root==null){
            return 0;
        }

        int l=maxDepth(root.left);
        int r=maxDepth(root.right);

        return Math.max(l,r)+1;
    }
}
