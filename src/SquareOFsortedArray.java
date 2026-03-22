import java.util.Arrays;

public class SquareOFsortedArray {
//    approach 1 : make square array and sort tem by Arrays.sort();
    static int[] Square(int[] a){
        int n=a.length;
//        int[] result=new int[n];
        for (int i=0;i<n;i++){
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
    public static void main(String[] args){
        int[] arr={1,9,4,2,5,6,7};
        int[] output=TwoPointer(arr);
        for (int i=0;i< output.length;i++){
            System.out.print(output[i] + " ");
        }
    }
}
