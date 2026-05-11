package hash_map;

import java.util.HashMap;
import java.util.Map;

public class hash_map3 {
    static void main(String[] args) {


        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("math", 95);
        marks.put("science", 85);
        marks.put("english", 55);

//        looping

        // 1 loop only key

        for (String k:marks.keySet()){
            System.out.println(k);
        }

        // 2 only values

        for (int v:marks.values()){
            System.out.println(v);
        }

        // both key and values

        for (String k:marks.keySet()){
            System.out.println(k + ":" + marks.get(k));
        }

        // more efficient entrySet()

        for (Map.Entry<String,Integer> entry: marks.entrySet()){
            String sub= entry.getKey();
            int number= entry.getValue();
            System.out.println(sub + "->" + number);

        }
    }
}
