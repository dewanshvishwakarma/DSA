import java.util.Scanner;

public class LBP137_reverse_of_each_elemrnt {
    static int reverse(int n){
        int rev=0;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] a=new int[n];

        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        for(int i=0;i<a.length;i++){
            a[i]=reverse(a[i]);
        }

        for(int j=0;j<a.length;j++){
            System.out.print(a[j] + " ");
        }
    }
}
