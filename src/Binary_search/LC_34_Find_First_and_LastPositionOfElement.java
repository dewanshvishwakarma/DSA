package Binary_search;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class LC_34_Find_First_and_LastPositionOfElement {

    //using binary search
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

   //linear brute force approach
   static public int[] search_by_linear(int[] a,int target){
        int f=-1;
        int l=-1;
        for (int i=0;i<a.length;i++){
            if(a[i]==target){
                if(f==-1){
                    f=i;
                }
                l=i;
            }
        }
        return new int[]{f,l};
   }

    public static void main(String[] args) {
        int[] a={5,7,7,8,9,9,9,9,9,10};
        int[] ans=search_by_linear(a,9);
        for (int i=0;i< ans.length;i++){
            System.out.println(ans[i] + " ");
        }


    }
}

