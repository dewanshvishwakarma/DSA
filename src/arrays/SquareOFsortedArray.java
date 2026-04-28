package arrays;

import java.util.Arrays;

public class SquareOFsortedArray {
//    approach 1 : make square array and sort tem by Arrays.sort();
    static int[] Square(int[] a){
        for (int i=0;i<a.length;i++){
            a[i]=a[i]*a[i];
        }
        Arrays.sort(a);
        return a;
    }




//    approach 2: Two Pointer
    /* take l and r in array and i in at end in new array compare abs value of l and r ; */


    static int[] TwoPointer(int[] a){
        int n=a.length;
        int l=0;
        int r=n-1;
        int[] result=new int[n];
        for (int i=n-1;i>=0;i--){
            if (Math.abs(a[l])>Math.abs(a[r])){
                result[i]=a[l]*a[l];
                l++;
            }else {
                result[i]=a[r]*a[r];
                r--;
            }
        }
        return result;
    }

//    solve by two pinter but by while loop
    static int[] Square2(int[] a){
        int i=0;
        int j=a.length-1;
        int[] result=new int[a.length];
        int k= result.length-1;
        while (i<=j){
            if (Math.abs(a[i])>Math.abs(a[j])){
                result[k]=a[i]*a[i];
                i++;
            }else {
                result[k]=a[j]*a[j];
                j--;
            }
            k--;
        }
        return result;
    }


    public static void main(String[] args){
        int[] arr={-4,-1,0,3,10};
        int[] output=Square2(arr);
        for (int i=0;i< output.length;i++){
            System.out.print(output[i] + " ");
        }
    }
}
