package arrays;

//remove duplicate by simple two pointer extra array logic (not optimize solution)

public class remove_duplicate {
    static void Duplicate(int[] a ){
        int n= a.length;
        int[] arr =new int[n];
        int j=0;
        arr[0]=a[0];
        for (int i=1;i<n;i++){
            if (a[i]!=arr[j]){
                j++;
                arr[j]=a[i];
            }
        }

        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main (String[] args){
        int[] a1={2,2,3,3,4,6,6};
        Duplicate(a1);

    }
}
