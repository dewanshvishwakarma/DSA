package hash_map;

import java.util.HashMap;
//https://www.geeksforgeeks.org/problems/key-pair5616/1?page=2&category=Arrays,Java&sortBy=submissions
public class GFG_Two_Sum_Pair_with_Given_Sum {
   static boolean twoSum(int[] a, int target){
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int i=0;i<a.length;i++){
            int c=target-a[i];
            if (map.containsKey(c)){
                return true;
            }else {
                map.put(a[i],i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a={1, -2, 1, 0, 5};;
        boolean res=twoSum(a,0);
        System.out.println(res);
    }
}
