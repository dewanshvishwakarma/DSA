package Two_pointer;

public class LC_677_square_of_sorted_array {
    static int[] sortedSquares(int[] nums){
        int n=nums.length;
        int[] ans=new int[n];
        int i=0;
        int j=n-1;
        int k=ans.length-1;
        while(i<=j){
            if(Math.abs(nums[i])<=Math.abs(nums[j])){
                ans[k]=nums[j]*nums[j];
                k--;
                j--;
            }else{
                ans[k]=nums[i]*nums[i];
                k--;
                i++;
            }
        }
        return ans;
    }
}
