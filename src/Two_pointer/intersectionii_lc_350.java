package Two_pointer;

//Given two integer arrays nums1 and nums2, return an array of their intersection.Each element in the result must appear as many times
// as it shows in both arrays and you may return the result in any order.
//https://leetcode.com/problems/intersection-of-two-arrays-ii/description/

import java.util.ArrayList;
import java.util.HashMap;

public class intersectionii_lc_350 {
    static public int[] intersect(int[] a, int[] b){
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }

        //traverse the b if element present in array b add it to ans and decrease the frequency
        // we need find ans[] array length also
        //initially we have not able to find the length
        //so use ArayyList<> add element to it

        for (int i=0;i<b.length;i++){
            if (map.containsKey(b[i]) && map.get(b[i])>0){
                map.put(b[i],map.get(b[i])-1);
                list.add(b[i]);
            }

        }
        int[] ans=new int[list.size()];
        int i=0;
        for (int j:list){
            ans[i]=j;
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a={1,2,2,1};
        int[] b={2,2};
        int ans[]=intersect(a,b);
        for (int i=0;i< ans.length;i++){
            System.out.println(ans[i] + " ");
        }
    }
}
