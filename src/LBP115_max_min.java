import java.util.Scanner;

public class LBP115_max_min {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int max=a[0];
        int min=a[0];

        for(int j=0;j<a.length;j++){
            if(a[j]>max){
                max=a[j];
            }
            if(a[j]<min){
                min=a[j];
            }
        }
        int span=max-min;
        System.out.print(span);

    }
}
