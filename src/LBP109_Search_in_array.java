import java.util.Scanner;

public class LBP109_Search_in_array {

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];

        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int search=sc.nextInt();
        int index=-1;
        for(int j=0;j<a.length;j++){
            if(a[j]==search){
                index=j;
                break;
            }
        }
        System.out.print(index);

    }
}
