import java.util.Scanner;

public class LBP132_greatest_on_right_side {
    static void greatest(int[] a){

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] a=new int[n];

        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        int max=a[0];

        for(int j=0;j<a.length;j++){
            if(a[j]>max){
                max=a[j];
            }
        }

        int k=a.length-1;

        if(max==a[k]){
            for(int m=0;m<a.length;m++){
                a[m]=max;
            }
        }

        for(int h=0;h<a.length;h++){
            System.out.print(a[h] + " ");
        }
    }
}
