package Two_pointer;
//https://leetcode.com/problems/number-of-subsequences-that-satisfy-the-given-sum-condition/
public class LC_1498_number_of_subseq_sum_condition {
    public int numSubseq(int[] nums, int target) {
        int n=nums.length;
        int[] power=new int[n];
        int mod = 1_000_000_007;
        power[0]=1;
        int count=0;
        for (int i=1;i<n;i++){
            power[i]=(power[i-1]*2)%mod;
        }

        int mim=0;
        int r=n-1;
        while (mim<r){
            if(nums[mim]+nums[r]<=target){
                count=count+power[r-mim]%mod;
                mim++;
            }else{
                r--;
            }
        }

        return count;
    }

}
