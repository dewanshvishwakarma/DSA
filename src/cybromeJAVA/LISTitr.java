package cybromeJAVA;

import java.util.LinkedList;
import java.util.ListIterator;

public class LISTitr {
    static void main(String[] args) {
        LinkedList l= new LinkedList();

        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");
        l.add("e");

        ListIterator itr = l.listIterator();

        while (itr.hasNext()){
           String str =(String)itr.next();
            System.out.println(str);
            System.out.println();
           }

        while (itr.hasPrevious()){
            String str=(String)itr.previous();
            System.out.println(str);
        }

        }
    }

