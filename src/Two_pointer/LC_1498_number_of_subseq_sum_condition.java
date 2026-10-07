package Two_pointer;
//https://leetcode.com/problems/number-of-subsequences-that-satisfy-the-given-sum-condition/
public class LC_1498_number_of_subseq_sum_condition {
    public void numSubseq(int[] nums, int target) {
        int n=nums.length;
        int[] power=new int[n];
        int mod = 1_000_000_007;
        power[0]=1;
        for (int i=1;i<n;i++){
            power[i]=(power[i-1]*2)%mod;
        }
    }

}
