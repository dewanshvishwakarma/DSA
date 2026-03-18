package arrays;

public class CountEvenOdd {
    static int[] Count(int[] arr){
        int n=arr.length;
        int E_count=0;
        int O_count=0;
        for (int i=0;i<n;i++){
            if (arr[i]%2==0){
                E_count++;
            }else {
                O_count++;
            }
        }
        return new int[]{E_count,O_count};
    }

    public static void main(String[] args){
        int[] a={2,4,6,8};
        int[] output=Count(a);
        System.out.println("even number are " + output[0]);
        System.out.println("odd number are " + output[1]);
    }
}
