package cybromeJAVA;

import java.util.Vector;

public class Vector1 {
    static void main(String[] args) {
        Vector v=new Vector<>();
        System.out.println(v.capacity());

        for (int i=0;i<=11;i++){
            v.addElement(i);
        }
        System.out.println(v.capacity());
        System.out.println(v);


//        remove
        v.remove(2);
        v.remove(3);
        v.remove(5);
        System.out.println(v.capacity());
    }
}
