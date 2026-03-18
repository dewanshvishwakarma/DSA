package arrays;

public class MoveZero {
    static void Swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    static void Move(int[] nums){
        int n= nums.length;
        int non_Zero=0;
        for (int i=0;i<n;i++){
            if(nums[i]!=0){
                Swap(nums,i,non_Zero);
                non_Zero++;
            }
        }
    }
    public static void main(String[] args){
        int[] a={1,0,4,0,5,0,4,0,0};
        Move(a);
        for(int i=0;i< a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}