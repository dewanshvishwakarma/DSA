package Two_pointer.Lc_905_905;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums){
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

    }
}
