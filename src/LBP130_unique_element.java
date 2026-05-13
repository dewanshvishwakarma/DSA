import java.util.Scanner;

public class LBP130_unique_element {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int[] a=new int[n];
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        int i=0;

        for (int j=1;j< a.length;j++){
            if (a[i]!=a[j]){
                i++;
                a[i]=a[j];
            }
        }

        for(int k=0;k<=i;k++){
            System.out.println(a[k] + " ");
        }
    }
}
