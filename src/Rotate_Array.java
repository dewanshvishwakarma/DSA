import java.util.Scanner;
// Rotate the given array by k step where k is non-negative
//simple approach two loop

public class Rotate_Array {
    static int[] Rotate(int[] a ,int k){
        int n= a.length;
        k=k%n;
        int j=0;
        int[] ans=new int[n];
        for(int i=n-k;i<n;i++){
            ans[j++]=a[i];
        }
        for(int i=0;i<n-k;i++){
            ans[j++]=a[i];
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size :");
        int n= sc.nextInt();
        int[] arr=new int[n];

        System.out.println("enter the " + n + " elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("enter the k times to rotate :");
        int k= sc.nextInt();

        int[] output=Rotate(arr,k);
        System.out.println("rotate array is :");

        for(int i=0;i<n;i++){
            System.out.print(output[i]+" ");
        }
    }
}
