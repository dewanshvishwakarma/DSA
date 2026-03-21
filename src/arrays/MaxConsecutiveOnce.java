package arrays;

public class MaxConsecutiveOnce {
    static  int CountOne(int[] a){
        int n=a.length;
        int count=0;
        int max=0;
        for(int i=0;i<n;i++){
            if (a[i]==1){
                count++;
                max=Math.max(max,count);
            }else {
                count=0;
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] a={1,0,1,1,1,1,1};
        int result=CountOne(a);
        System.out.println(result);
    }
}
