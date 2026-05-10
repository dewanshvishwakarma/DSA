import java.util.Scanner;

public class LBP120_add_at_last {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];

        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        int x=sc.nextInt();

        int[] b= new int[n+1];

        b[b.length-1]=x;

        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }

        for(int j=0;j<b.length;j++){
            System.out.print(b[j]+ " ");
        }

    }
}
