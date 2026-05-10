import java.util.Scanner;

public class LBP128_increment {
    static void increment(int[] a){
        int n=a.length;;
        for(int i=0;i<n;i++){
            a[i]=a[i]+1;
        }
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        increment(a);

        for(int j=0;j<a.length;j++){
            System.out.print(a[j] + " ");
        }
    }
}
