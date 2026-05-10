import java.util.Scanner;

public class LBP122_delete_last {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];

        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length-1;i++){
            System.out.print(a[i]+" ");
        }

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
