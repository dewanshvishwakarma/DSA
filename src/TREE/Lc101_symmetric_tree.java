package TREE;

public class Lc101_symmetric_tree {


    static public boolean issymTree(Node p,Node q){
        if (p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }

        if (p.data!=q.data){
            return false;
        }

        boolean left=issymTree(p.left,q.right);
        boolean right =issymTree(p.right,q.left);

        return left && right;
    }
    public static void main(String[] args) {

    }
}
