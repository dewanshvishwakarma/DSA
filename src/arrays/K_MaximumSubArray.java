package arrays;

public class K_MaximumSubArray {

//    approach 1: two pointer approach o(n^2)
    static int MaxSub(int[] a ,int k){
        int max=Integer.MIN_VALUE;

        for (int i=0;i<= a.length-k;i++){
        int currentMax=0;
            for (int j=i;j<i+k;j++){
                currentMax=currentMax+a[j];
                max=Math.max(currentMax,max);
            }
        }
        return max;
    }
    static void main(String[] args) {
        int[] array={2,9,31,-4,21,7};
        int result=MaxSub(array,3);
        System.out.println(result);
    }
}
