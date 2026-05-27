package arrays;

public class Lc209_minimum_size_sub_array {
    static int min_sub(int[] a,int target){
        int n=a.length;
        int i=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        for (int j=0;j<n;j++){
            sum=sum+a[j];

            while (sum>=target ){
                min=Math.min(min,j-i+1);
                sum=sum-a[i];
                i++;
            }
        }
        if (min==Integer.MAX_VALUE){
            return 0;
        }else {
            return min;
        }
    }
    static void main(String[] args) {


    }
}
