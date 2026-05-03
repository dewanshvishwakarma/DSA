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

    static int Duplicate2(int[] a){
        int n=a.length;
        int i=0;
        int j=1;
        while (j<n){
            if (a[i]==a[j]){
                j++;
            }
            else{
                i++;
                a[i]=a[j];
                j++;
            }
        }
        return i+1;
    }

    public static void main(String[] args){
        int[] a={2,2,3,3,4,6,6,11,11,11,12,13,};
        int index=Duplicate2(a);
        for (int i=0;i<index;i++){
            System.out.println(a[i]);
        }
    }
}
