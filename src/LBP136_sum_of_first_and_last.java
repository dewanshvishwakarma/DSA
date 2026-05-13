import java.util.Scanner;

public class LBP136_sum_of_first_and_last {
    static int[] sum_last_first(int[] a){
        int size = (a.length + 1) / 2;
        int i=0;
        int j=a.length-1;
        int k=0;
        int[] b=new int[size];
        while(i<=j){
            b[k++]=(a[i]+a[j]);
            i++;
            j--;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] result = sum_last_first(a);

        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
