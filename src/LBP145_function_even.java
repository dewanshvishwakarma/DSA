import java.util.Scanner;

public class LBP145_function_even {
    static void even(int[] a){
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int[] a=new int[n];
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        even(a);

    }
}
