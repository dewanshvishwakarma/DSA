package Two_pointer;

import java.util.HashSet;
import java.util.Set;

public class Intersection_of_array {
    public int[] intersection(int[] nums1, int[] nums2) {


        Set<Integer> set =new HashSet<>();//set for nums 1 remove duplicate
        Set<Integer> set2=new HashSet<>();//for nums 2
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }

        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                set2.add(nums2[i]);
            }
        }

        int[] ans=new int[set2.size()];
        int j=0;
        for(int x:set2){
            ans[j]=x;
            j++;
        }

        return ans;
    }
}
