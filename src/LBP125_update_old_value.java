import java.util.Scanner;

public class LBP125_update_old_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int update1=sc.nextInt();
        int update=sc.nextInt();


        for(int i=0;i<a.length;i++){
            if(a[i]==update1){
                a[i]=update;
            }
        }

        for(int j=0;j<a.length;j++){
            System.out.print(a[j]+ " ");
        }
    }
}
