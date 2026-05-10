import java.util.Scanner;

public class LBP126_insert_at_position {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int index=sc.nextInt();
        int value=sc.nextInt();

        for(int i=0;i<a.length;i++){
            if(i==index){
                a[i]=value;
            }
        }

        for(int j=0;j<a.length;j++){
            System.out.print(a[j]+ " ");
        }

    }
}
