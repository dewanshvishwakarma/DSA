package Linked_list;

public class remove_n_node_last {
    static public Node remove(Node head,int n){
        Node dummy=new Node(0);
        dummy.next=head;
        Node f=dummy;
        Node s=dummy;
        for (int i=0;i<n;i++){
            f=f.next;
        }

        while (f.next!=null){
            f=f.next;
            s=s.next;
        }
        s.next=s.next.next;

        return dummy.next;
    }

    public Node removeNthFromEnd(Node head,int n){
        int len=0;
        Node temp1=head;
        while (temp1!=null){
            len++;
            temp1=temp1.next;
        }
        if (len==n){
            return head.next;
        }
        Node temp=head;

        for (int i=0;i<len-n;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;

    }

    static void print (Node temp){
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }

    public static void main(String[] a){
        Node head=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(500);

        head.next=b;
        b.next=c;
        c.next=d;

        Node r=remove(head,1);
        print(r);


    }
}
