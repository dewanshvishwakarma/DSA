package arrays;
//136. Single Number

/*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.



Example 1:

Input: nums = [2,2,1]

Output: 1*/
public class single_number {
    static int  single(int[] a){
        int n=a.length;
        int f=a[0];
        for (int i=1;i<n;i++){
            f=f^a[i];
        }
        return f;
    }
    public static void main(String[] args){
int[] arr={2,2,1};
int result=single(arr);
        System.out.println(result);
    }
}
