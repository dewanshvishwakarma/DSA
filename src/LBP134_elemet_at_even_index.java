import java.util.Scanner;

public class LBP134_elemet_at_even_index {
    static int sumof_even(int[] a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            if(i%2==0){
                sum+=a[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] a=new int[n];

        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        int result=sumof_even(a);
        System.out.print(result);
    }
}
