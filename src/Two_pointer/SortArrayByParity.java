package Two_pointer;

public class SortArrayByParity {
   static public int[] sortArrayByParity(int[] nums){
        int n=nums.length;
        int k=0;
        for(int i=0;i<n;i++){
            if (nums[i]%2==0){
                int temp=nums[i];
                nums[i]=nums[k];
                nums[k]=temp;
                k++;
            }
        }
        return nums;
    }

    public static void main(String[] args){
        int[] a={2,4,3,3,5,1,7,8};
        int[] ans=sortArrayByParity(a);
        for(int i=0;i< ans.length;i++){
            System.out.println(ans[i]+  " ");
        }

    }
}
