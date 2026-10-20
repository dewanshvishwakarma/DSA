package Binary_search;

public class LC_33_search_in_rotatd_sorted_array {

    static int search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;

            if(target==nums[mid]){
                return mid;
            }

            if(nums[l]<=nums[mid]){
                if(target>=nums[l] && target<nums[mid]){
                    r=mid-1;
                }else{
                    l=mid+1;
                }
            }else{
                if(target<=nums[r] && target>nums[mid]){
                    l=mid+1;
                }else{
                    r=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {

    }
}
