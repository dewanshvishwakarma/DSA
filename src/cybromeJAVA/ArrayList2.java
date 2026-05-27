package cybromeJAVA;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.RandomAccess;


public class ArrayList2 {
    static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String >();
        LinkedList<String> ll=new LinkedList<String>();

        al.add("d");
        al.add("e");
        al.add("w");
        al.add("ansh");
        System.out.println(al);
        System.out.println(al instanceof Serializable);
        System.out.println(al instanceof RandomAccess);
        System.out.println(al instanceof Cloneable);


        System.out.println(ll instanceof Serializable);
        System.out.println(ll instanceof RandomAccess);
        System.out.println(ll instanceof Cloneable);
    }
}
//arraylist are instance of random ascess