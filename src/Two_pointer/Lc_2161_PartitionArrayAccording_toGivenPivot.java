package Two_pointer;

import java.util.ArrayList;
import java.util.List;

public class Lc_2161_PartitionArrayAccording_toGivenPivot {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        List<Integer> g=new ArrayList<>();
        List<Integer> s=new ArrayList<>();
        List<Integer> e=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(nums[i]>pivot){
                g.add(nums[i]);
            }else if(nums[i]==pivot){
                e.add(nums[i]);
            }else{
                s.add(nums[i]);
            }
        }

        int[] ans=new int[nums.length];
        int k=0;
        for(int x:s){
            ans[k]=x;
            k++;
        }
        for(int y:e){
            ans[k]=y;
            k++;
        }
        for(int z:g) {
            ans[k] = z;
            k++;
        }
        return ans;
    }
}

