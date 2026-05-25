package Deque;
import java.util.ArrayDeque;
import java.util.Deque;

public class deque {
    static void main(String[] args) {
        Deque<Integer> dq=new ArrayDeque<>();

        dq.addFirst(10);
        dq.addFirst(20);
        dq.addLast(30);
        System.out.println(dq);

        dq.offerFirst(100);
        dq.offerLast(200);

        System.out.println(dq);

        System.out.println(dq.peekFirst());
        System.out.println(dq);

    }
}
