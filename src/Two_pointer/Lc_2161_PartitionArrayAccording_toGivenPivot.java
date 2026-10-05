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

    static public int[] pivotArray2(int[] nums, int pivot){
        int n =nums.length;
        int[] ans=new int[n];
        int e=0;
        int g=0;
        int s=0;
        for(int i=0;i<n;i++){
            if(nums[i]==pivot){
                e++;
            }else if(nums[i]>pivot){
                g++;
            }else{
                s++;
            }
        }

        int ss=0;
        int ee=s;
        int gg=s+e;
        for(int i=0;i<n;i++){
            if(nums[i]==pivot){
                ans[ee]=nums[i];
                ee++;
            }else if(nums[i]>pivot){
                ans[gg]=nums[i];
                gg++;
            }else{
                ans[ss]=nums[i];
                ss++;
            }
        }

return  ans;
    }

    public static void main(String[] args){
        int[] a={9,12,5,10,14,3,10};
        int[] ans=pivotArray2(a,10);
        for (int i=0;i<ans.length;i++){
            System.out.println(ans[i] + " ");
        }
    }
}

