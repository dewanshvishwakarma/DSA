package TREE;
 class Node{
    int data;
    Node left,right;

    Node(int data){
        this.data=data;
    }
}
public class node_class {

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);

        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.right.data);
    }
}

