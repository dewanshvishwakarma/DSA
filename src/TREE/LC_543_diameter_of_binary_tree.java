package TREE;

public class LC_543_diameter_of_binary_tree {
    int dia=0;
    public int diameterOfBinaryTree(Node root) {
        height(root);
        return dia;
    }

    private int height(Node root){
        if(root==null){
            return 0;
        }

        int l= height(root.left);
        int r= height(root.right);
        dia=Math.max(dia,l+r);
        return Math.max(l,r)+1;
    }
}
