package cybromeJAVA;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator {
    static void main(String[] args) {
        ArrayList l=new ArrayList();

        for (int i=1;i<=10;i++){
            l.add(i);
        }

        Iterator itr=l.iterator();
        while (itr.hasNext()){
            Integer i=(Integer) itr.next();
            System.out.println(i);
            itr.remove();//remove
        }

        System.out.println(l);//empty list
    }
}
