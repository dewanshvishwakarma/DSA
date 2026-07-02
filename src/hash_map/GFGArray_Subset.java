package hash_map;

import java.util.HashMap;

public class GFGArray_Subset {
    static boolean isSubset(int[] a,int[] b){
        HashMap<Integer,Integer> map=new HashMap<>();
        int m=a.length;
        int n=b.length;
        if (n>m){
            return false;
        }
        for (int i=0;i<m;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        for (int i=0;i<n;i++){
            if (map.containsKey(b[i])){
                map.put(b[i],map.get(b[i])-1);

                if (map.get(b[i])<0){
                    return false;
                }
            }else {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        int [] a={10, 5, 2, 23, 19};
        int[] b={19, 5, 3};
        boolean ans=isSubset(a,b);
        System.out.println(ans);
    }
}
