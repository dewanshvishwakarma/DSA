package hash_map;

import java.util.HashMap;

public class hash_map1 {
    public static void main(String[] args){
//        create hashMap

        HashMap<String,Integer> marks=new HashMap<>();

        marks.put("math",95);
        marks.put("science",85);
        marks.put("english",55);

        System.out.println(marks);// print in unordered way

//        update

        marks.put("english",99);

        System.out.println(marks);
    }
}
