package arrays;

public class Remove_Duplicate_inPLace {
    static int Duplicate(int[] arr){
        int n= arr.length;
        int j=0;
        for (int i=1;i<n;i++){
            if (arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }
        return j+1;
    }

    public static void main(String[] args){
        int[] a={2,2,3,3,4,6,6,11,11,11,12,13,};
        int index=Duplicate(a);
        for (int i=0;i<index;i++){
            System.out.println(a[i]);
        }
    }
}
