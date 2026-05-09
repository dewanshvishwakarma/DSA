package arrays;
import java.util.Scanner;
public class LBP118_occurrence_of_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int f=sc.nextInt();
        int count=0;
        for(int j=0;j<a.length;j++){
            if(a[j]==f) count++;
        }
        System.out.print(count);

    }

}
