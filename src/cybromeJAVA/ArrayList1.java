package cybromeJAVA;

import java.util.ArrayList;

public class ArrayList1 {
    static void main(String[] args) {
//        add element in arraylist
        ArrayList list=new ArrayList();
        list.add("A");
        list.add(20);
        list.add(null);
        list.add(1,"B");
        System.out.println(list);

//        remove element in array list
        list.remove(1);
        System.out.println(list);

//        type safety generic method with type safe



    }
}
