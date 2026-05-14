package hash_map;

import java.util.HashMap;

public class Q1_majority_element {
    public static void main(String[] args) {
        int[] a={1,3,2,5,1,3,1,5,1};
        int n=a.length;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int v: a){
            if(map.containsKey(v)){
                map.put(v, map.get(v)+1);
            }else{
                map.put(v,1);
            }
        }

        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {

            int key = entry.getKey();
            int value = entry.getValue();

            if (value > (n / 3)) {
                System.out.println(key);
            }
        }


    }
}
