package String;
import java.util.Scanner;

public class LBP116_second_max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        int max=a[0];
        int second =-1;

        for(int j=0;j<a.length;j++){
            if(a[j]>max){
                second=max;
                max=a[j];
            }
            else if(a[j]<max && a[j]>second){
                second=a[j];
            }
        }
        System.out.print(second);

    }
}
