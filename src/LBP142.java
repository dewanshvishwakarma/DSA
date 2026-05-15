import java.util.Scanner;

public class LBP142 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();

        int[] r=new int[n];

        for(int i=0;i<n;i++){
            r[i]=(i+1)*m;
        }

        for(int j=0;j<r.length;j++){
            System.out.print(r[j] + " ");
        }
    }
}
