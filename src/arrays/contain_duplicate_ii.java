package arrays;

import java.util.HashMap;
import java.util.Map;

public class contain_duplicate_ii {
    static boolean containDup(int[] a, int k){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i< a.length;i++){
            if (map.containsKey(a[i])){
                int dif=i-map.get(a[i]);
                if (dif<=k){
                    return true;
                }
            }
            map.put(a[i],i);
        }
return false;
    }
    static void main(String[] args) {
    int[] arr={1,2,3,1,2,3};
    boolean result=containDup(arr,2);
        System.out.println(result);
    }
}
