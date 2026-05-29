package cybromeJAVA;

import java.util.Stack;

public class Stack1 {
    static void main(String[] args) {
        Stack s=new Stack<>();
        for (int i=1;i<=5;i++){
            s.push(i);// add element at top
        }


        s.pop();//to remove element
        System.out.println(s.search(2));//give offset of 2
        System.out.println(s.peek());//print only top element
        System.out.println(s.empty());//check empty or not

        System.out.println(s);
    }
}
