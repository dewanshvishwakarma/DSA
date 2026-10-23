package Recursion;

public class BinarySearch {
    static int bs(int[] a, int target, int l, int r){
        int mid=l+(r-l)/2;

        if (a[mid]== target){
            return mid;
        }else if(target>a[mid]){
           return bs(a,target,mid+1,r);
        }else{
            return bs(a,target,l,mid-1);
        }
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,6,7,9};
        int n=a.length;
        int ans=bs(a,9,0,n-1);
        System.out.println(ans);
    }
}
