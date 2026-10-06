package Two_pointer;

public class Lc_922_sort_array_by_parity2 {
    // use an extra space array
    // can be optimized using pointer in  place

    static public int[] sortArrayByParityII(int[] nums){
        int n=nums.length;
        int[] ans=new int[n];
        int e=0;
        int o=1;
        for (int num:nums){
            if(num%2==0){
                ans[e]=num;
                e=e+2;
            }else{
                ans[o]=num;
                o=o+2;
            }
        }
            return  ans;
    }
    public static void main(String[] args){

    }
}
