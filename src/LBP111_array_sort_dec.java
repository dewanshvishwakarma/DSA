import java.util.Scanner;

public class LBP111_array_sort_dec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int[] a=new int[l];
        int n=a.length;

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int k=i+1;k<n;k++){
                if(a[i]<a[k]){
                    int temp=a[i];
                    a[i]=a[k];
                    a[k]=temp;
                }
            }
        }
        for(int j=0;j<n;j++){
            System.out.print(a[j] + " ");
        }

    }
}
