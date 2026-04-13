package arrays;

public class K_maxSub_sliding_win {
    static int slide(int[] a,int k){
        int W_sum=0;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<k;i++){
            W_sum+=a[i];
        }
        max=W_sum;

        for(int i=k;i<a.length;i++){
            W_sum=W_sum-a[i-k]+a[i];
            max=Math.max(W_sum,max);
        }
        return max;
    }
    static void main(String[] args) {
        int[] array={2,1,5,1,3,2};
        int result=slide(array,3);
        System.out.println(result);
    }
}
