package Binary_search;

public class LC_34_Find_First_and_LastPositionOfElement {

    static int find_first(int[] a,int target,int n){
            int i=0;
            int j=n-1;
            int left_index=-1;
            while(i<=j){
                int mid=i+(j-i)/2;
                if (a[mid]==target){
                    left_index=mid;
                    j=mid-1;
                }else if(a[mid]>target){
                    j=mid-1;
                }else{
                    i=mid+1;
                }
            }
            return left_index;
    }

    static int right_most(int[] a,int target,int n){
        int i=0;
        int j=n-1;
        int right_index=-1;
        while (i<=j){
            int mid=i+(j-i)/2;

            if (a[mid]==target){
                right_index=mid;
                i=mid+1;
            }else if(a[mid]>target){
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return right_index;
    }


   static public int[] searchRange(int[] nums, int target){
            int l=find_first(nums,target,nums.length);
            int r=right_most(nums,target,nums.length);
            return new int[]{l,r};
   }

    public static void main(String[] args) {
        int[] a={5,7,7,8,9,9,9,9,9,10};
        int[] ans=searchRange(a,9);
        for (int i=0;i< ans.length;i++){
            System.out.println(ans[i] + " ");
        }
    }
}

