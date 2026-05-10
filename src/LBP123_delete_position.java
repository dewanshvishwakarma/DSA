import java.util.Scanner;

public class LBP123_delete_position {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];

        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        int index=sc.nextInt();
        for(int i=0;i<a.length;i++){
            if(i==index){
                continue;
            }
            System.out.print(a[i] + " ");
        }


    }
}
