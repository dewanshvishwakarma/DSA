package arrays;
//283. Move Zeroes
/*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.



Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]*/


public class Move_zero_2 {

    static void move_zero_end(int[] a){
        int n= a.length;
        int nz=0;
        int z=0;
        while (nz<n){
            if (a[nz]!=0){
                int temp=a[nz];
                a[nz]=a[z];
                a[z]=temp;
                z++;
                nz++;
            }
            else {
                nz++;
            }
        }
    }
    public static void main(String[] args){
        int[] arr={0,2,0,4,1,0,1,0,2,0};
        move_zero_end(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
