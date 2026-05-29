package hash_map;

import java.util.HashMap;

public class LC287_find_duplicate {
    static int duplicate(int[] a){
        int n=a.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<a.length;i++){
            if (map.containsKey(a[i])){
                return a[i];
            }
            map.put(a[i],1);
        }
        return -1;
    }
    static void main(String[] args) {
        int[] a={3,1,4,2};
        int result=duplicate(a);
        System.out.println(result);
    }
}
