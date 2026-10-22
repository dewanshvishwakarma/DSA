package Recursion;

public class isSorted {
    static boolean checkSorted(int[] a, int n){
        if(n==0 || n==1){
            return  true;
        }
        return a[n-1]>a[n-2] && checkSorted(a,n-1);
    }

    public static void main(String[] args) {
        int[] a={2,4,5,6,7,8,9};
        int n=a.length;
        boolean ans=checkSorted(a,n);
        System.out.println(ans);
    }
}

