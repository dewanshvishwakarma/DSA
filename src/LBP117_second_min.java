import java.util.Scanner;

public class LBP117_second_min {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        int min=Integer.MIN_VALUE;
        int second =Integer.MAX_VALUE;

        for(int j=0;j<a.length;j++){
            if(a[j]<min){
                second=min;
                min=a[j];
            }
            //8 4 6
            else if(a[j]>min && a[j]<second){
                second=a[j];
            }
        }
        System.out.print(second);

    }
}
