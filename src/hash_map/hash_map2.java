package hash_map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class hash_map2 {
    static void main(String[] args) {
        HashMap<String, Integer> marks=new HashMap<>();

        marks.put("math",95);
        marks.put("science",85);
        marks.put("english",55);

        //important method used
        marks.get("math");// give key value(95)
        marks.put("hindi",88);// add hindi

        System.out.println(marks);// add hindi

        System.out.println(marks.containsKey("english")); //check key exist or not (true)
        System.out.println(marks.containsValue(90));//(false)

        System.out.println(marks.size());//(4)

        marks.remove("hindi");
        System.out.println(marks);
    }
}
