import java.util.Scanner;

public class LBP135_sum_of_element_at_odd {
    static int sumof_odd(int[] a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            if(i%2!=0){
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

        int result=sumof_odd(a);
        System.out.print(result);
    }
}
